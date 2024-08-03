/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab;

import java.time.temporal.TemporalAdjusters;
import javax.sound.sampled.DataLine;

/**
 *
 * @author Sanket Prajapati
 */
public class Linkedlist {
     public static class Node{
         int data;
         Node next;
         
         public Node(int data)
         {
             this.data = data;
             this.next = null;
         }
     }
     
     public static Node head;
     public static Node tail;
     public static int size;
     
     public void addFirst(int data)
     {   // O(1)
        Node newnode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        
        head = newnode;
        
     }
     
     public void addLast(int data)
     { // O(1)
         Node newNode = new Node(data);
         size++;
         if(head == null)
         {
             head = tail = newNode;
             return;
         }
         
         tail.next = newNode;
         tail = newNode;
     }
     
     public void addMiddle(int data, int idx)
     {   
         if(idx == 0)
         {
             addFirst(data);
             return;
         }
         
         
         Node newNode = new Node(data);
         size++;
         int index = 0;
         Node temp = head;
         
         while(index < idx-1)  
         {
           temp = temp.next;
           index++;
         }
         
         newNode.next = temp.next;
         temp.next = newNode;
     }
     
     public int removeFirst()
     {
         if(size == 0)
         {
             System.out.println("LL is empty!");
             return Integer.MAX_VALUE;
             
         }else if(size == 1)
         {
             int val = head.data;
             head = tail = null;
             size--;
             return val;
         }
         
         int val = head.data;
         head = head.next;
         size--;
         return val;
     }
     
     public int removeLast()
     {
         if(size == 0)
         {
             System.out.println("LL is Empty");
             return Integer.MAX_VALUE;
         }else if(size == 1)
         {
             int val = head.data;
             head = tail = null;
             size = 0;
             return val;
         }
         Node prevNode; 
         prevNode = head;
         for(int i = 0; i<size-2; i++)
         {
             prevNode = prevNode.next;
         }
         
         int val = tail.data;
         prevNode.next = null;
         tail = prevNode;
         size--;
         return val;
     }
     
     public void printList()
     {   // O(n)
         if(head == null)
         {
             System.out.println("Linked LIST is empty!");
             return;
         }
         Node temp = head;
         while(temp != null)
         {
             System.out.print(+temp.data+" ->");
             temp = temp.next;
             
         }
         System.out.print("null");
         System.out.println();
         System.out.println("Size : "+size);
         
     }   
    
     public int itrSearch(int key)
     {  // O(n)
         Node temp = head;
         int index = 0;
         while(temp != null)
         {
             if(temp.data == key)
             {
                 return index;
             }
             temp = temp.next;
             index++;
         }
         return -1;
     }
     
     public int helper(int key, Node head)
     {
         if(head == null)
         {
             return -1;
         }
         
         if(head.data == key)
         {
             return 0;
         }
         
         int idx = helper(key,head.next);
         
         if(idx == -1)
         {
             return -1;
         }
         
         return idx+1;
     }
     
     public int recSearch(int key)
     {
         return helper(key,head);
     }
     
     public void reverse()
     {
         Node prev = null;
         Node next;
         Node curr = tail = head;
         
         while(curr != null)
         {
             next = curr.next;
             curr.next = prev;
             prev = curr;
             curr = next;
         }
         
         head = prev;
     }
     
     public void deleteNthfromEnd(int n)
     {
         int sz = 0;
         Node temp = head;
         
         while(temp != null)
         {
             temp = temp.next;
             sz++;
         }
         
         if(n == sz)
         {
             head = head.next;
             return;
         }
         
         int i = 1;
         int iTofind = sz - n;
         Node prev = head;
         while(i < iTofind)
                 {
                     prev = prev.next;
                     i++;
                 }
         
         prev.next = prev.next.next;
         size--;
         return;
     }
     
     public Node findMid(Node head)
     {
         Node slowNode;
         Node fastNode;
         
         slowNode = head;
         fastNode = head;
         
         while(fastNode != null && fastNode.next != null)
         {
             // + 1
             slowNode = slowNode.next;
             // + 2
             fastNode = fastNode.next.next;
         }
         
         return slowNode;
     }
     
     public boolean isPalidrome()
     {
         if(head == null || head.next == null)
         {
             return true;
         }
         // finding mid position
         Node MidNode = findMid(head);
         
         // reversing 2nd half of LL
         
         Node prev = null;
         Node curr = MidNode;
         Node next;
         
         while( curr != null)
         {
             next = curr.next;
             curr.next = prev;
             prev = curr;
             curr = next;
         }
         
         Node right = prev;
         Node left = head;
         
         while(right != null)
         {
             if(right.data != left.data)
             {
                 return false;
             }
             right = right.next;
             left = left.next;
         }
         return true;
     }
     
     public static boolean isCycle()
     {
         Node slow = head;
         Node fast = head;
         
         while(fast != null && fast.next != null)
         {
             slow = slow.next;
             fast = fast.next.next;
             
             if(slow == fast)
             {
                 return true;
                 // Cycle exists in the LL
             }
         }
         return false; // Cycle doesn't exisits
     }
     
     public static void removeCycle()
     {
         Node fast = head;
         Node slow = head;
         boolean cycle;
         cycle = false;
         
         while(fast != null && fast.next != null)
         {
             fast = fast.next.next;
             slow = slow.next;
             
             if(fast == slow)
             {
                 cycle = true;
                 break;
             }
         }
         
         if(cycle == false)
         {
             return;
         }
         
         Node prev = null;
         slow = head;
         
         while(slow != fast)
         {
             prev = fast;
             slow = slow.next;
             fast = fast.next;
         }      
         
         prev.next = null; // last Node
         return;
         
     }
     
     private Node getMid(Node head)
     {
         Node slow = head;
         Node fast = head.next;
         
         while(fast != null && fast.next != null)
         {
             slow  = slow.next;
             fast = fast.next.next;
         }
         return slow;
     }
     
     public Node mergeSort(Node head)
     {
         if(head == null || head.next == null)
         {  
             return head;
         }
         
         Node mid = getMid(head);
         Node Righthead = mid.next;
         
         mid.next = null;
         
         Node LeftNode = mergeSort(head);
         Node RightNode = mergeSort(Righthead);
         
        return merge(LeftNode, RightNode);
        
         
         
     }
     
     private Node merge(Node head1, Node head2)
     {
         Node mergeLL = new Node(-1);
         Node temp = mergeLL;
         
         while(head1 != null && head2 != null)
         {
             if(head1.data <= head2.data)
             {
                 temp.next = head1;
                 head1  = head1.next;
                 temp = temp.next;
                 
             }else{
                 temp.next = head2;
                 head2 = head2.next;
                 temp = temp.next;
                 
             }
             
                 
         }    
             
         
           while(head1 != null)
            {
                 temp.next = head1;
                 head1  = head1.next;
                 temp = temp.next;
            }
             
           while(head2 != null)
             {
                 temp.next = head2;
                 head2 = head2.next;
                 temp = temp.next;
             }
             return mergeLL.next;
         
         
     }
     
     public void Zigzag()
     {
         
         // find mid
         Node slow = head;
         Node fast = head.next;
         
         while(fast != null && fast.next != null)
         {
             slow = slow.next;
             fast = fast.next.next;
         }
         
         Node mid = slow;
          
         // Reversing 2nd half
         
         
         Node curr = mid.next;
         mid.next = null;
         Node next;
         Node prev = null;
         
         while(curr != null)
         {
             next = curr.next;
             curr.next = prev;
             prev = curr;
             curr = next;
         }
         
         
         // Alternate merging
         Node Righthead = prev;
         Node lefthead = head;
         Node nextL, nextR;
         
         while(Righthead != null && lefthead != null)
         {
             nextL = lefthead.next;
             lefthead.next = Righthead;
             nextR  = Righthead.next;
             Righthead.next = nextL;
             
             // update 
             Righthead  = nextR;
             lefthead = nextL;
         }
         
     }
         
     public static void main(String[] args) {
      /*
       Linkedlist ll = new Linkedlist();
       ll.addFirst(5);
       ll.addFirst(1);
       ll.addFirst(2);
       ll.addFirst(3);
       ll.addFirst(4);
       
       ll.printList();
       
       ll.head = ll.mergeSort(ll.head);
       ll.printList();
       */
      
      Linkedlist ll = new Linkedlist();
      ll.addLast(1);
      ll.addLast(2);
      ll.addLast(3);
      ll.addLast(4);
      ll.addLast(5);
      ll.addLast(6);
      ll.printList();
      ll.Zigzag();
      ll.printList();
       // 1-> 2-> 3 ->1
      
    }
     
     
}

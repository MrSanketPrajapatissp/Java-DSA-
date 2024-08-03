/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab;

/**
 *
 * @author Sanket Prajapati
 */
public class doublyLL {
    
 
    static class Node{
        Node next;
        Node prev;
        int data;
        
        public Node(int data)
        {
            
            this.next = null;
            this.data = data;
            this.prev = null;
            size++;
        }
        
    }
    
    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        
        
        
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        
    }
    
    public void removeFirst()
    {
        if(head == null)
        {
            System.out.println("Doubly Linked list is empty");
            return;
            
        }
        
        if(size == 1)
        {
            head = null;
            size--;
            return;
        }
        
        head = head.next;
        head.prev = null;
    }
    
    public int removeLast()
    {
        if(head == null)
        {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
            
        }
        
        if(head.next == null)
        {
            head = tail = null;
            return Integer.MIN_VALUE;
        }
        
        int val;
        Node secondLast = tail.prev;
        val = secondLast.data;
        secondLast.next = null;
        return  val;
    }
    
    public void printList()
    {
        Node temp = head;
        
        while(temp != null)
        {
            System.out.print(+temp.data+" <-> ");
            temp = temp.next;
        }
        
        System.out.print("null");
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        doublyLL dll = new doublyLL();
        dll.addFirst(3);
        dll.addLast(4);
        dll.printList();
        dll.removeLast();
        dll.printList();
    }
}

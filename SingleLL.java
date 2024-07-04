/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslab;

/**
 *
 * @author USER
 */


public class SingleLL {

    private int size;

    public SingleLL() {
        this.size = 0;
    }

    Node head;

    class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("Linked list is Empty");
            return;
        }

        Node currNode = head;

        while (currNode != null) {
            System.out.println(currNode.data + " -> ");
            currNode = currNode.next;

        }

        System.out.println("NULL");
    }

    public void insertAtmiddle(int index, String data) {
        if (index > size || index < 0) {
            System.out.println("Invalid Index");
            return;
        }

        Node newNode = new Node(data);

        if (head == null || index == 0) {
            newNode.next = head;
            head = newNode;
            return;

        }

        Node currNode = head;

        for (int i = 1; i < size; i++) {

            if (i == index) {
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
            }
            currNode = currNode.next;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("linked list is Empty");
        }

        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("linked list is Empty");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;

    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        SingleLL list = new SingleLL();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.printList();
        list.insertAtmiddle(0, "A");
        System.out.println();
        System.out.println(list.getSize());
        
        list.printList();
        list.deleteLast();
        list.printList();
        // list.insertAtmiddle(0, null);
    }
}

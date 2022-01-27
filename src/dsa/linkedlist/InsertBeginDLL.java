package dsa.linkedlist;

import java.lang.*;

public class InsertBeginDLL {
    int data;
    Node prev;
    Node next;

    void Node(int d) {
        data = d;
        prev = null;
        next = null;
    }
}

class Test3 {

    public static void main(String args[]) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        head = insertBegin(head, 5);
        printlist(head);

    }

    static Node insertBegin(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        if (head != null) head.prev = temp;
        return temp;
    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}


package dsa.linkedlist;

import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    public Node prev;
    public Node random;
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
public class InsertBegin {
    static Node insertBegin(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    public static void main(String args[]) {
        Node head = null;
        head = insertBegin(head, 30);
        head = insertBegin(head, 20);
        head = insertBegin(head, 10);
        printlist(head);
    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}


package dsa.linkedlist;
import java.util.*;
import java.io.*;
import java.lang.*;

public class CircularLinkedList {
    int data;
    Node next;

    void Node(int d) {
        data = d;
        next = null;
    }
}

class Test7 {

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
        head.next.next.next.next = head;
    }
}


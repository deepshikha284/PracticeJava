package dsa.linkedlist;

import java.util.*;
import java.lang.*;

public class PalindromeLinkedList {
    char data;
    Node next;

    void Node(char x) {
        data = x;
        next = null;
    }
}

class Test26 {

    public static void main(String args[]) {
        Node head = new Node('g');
        head.next = new Node('f');
        head.next.next = new Node('g');
        if (isPalindrome(head))
            System.out.print("Yes");
        else
            System.out.print("No");

    }

    static boolean isPalindrome(Node head) {
        Deque<Character> stack = new ArrayDeque<Character>();
        for (Node curr = head; curr != null; curr = curr.next)
            stack.push((char) curr.data);
        for (Node curr = head; curr != null; curr = curr.next) {
            if (stack.pop() != curr.data)
                return false;
        }
        return true;
    }
}


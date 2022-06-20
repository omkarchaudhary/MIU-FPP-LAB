package com.miu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseLinkedList {

    // create an object of Node class
    // represent the head of the linked list
    Node head;

    // static inner class
    static class Node {
        int value;

        // connect each node to next node
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    public static void main(String[] args) {

        // create an object of LinkedList
        ReverseLinkedList linkedList = new ReverseLinkedList();

        // assign values to each linked list node
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // connect each node of linked list to next node
        linkedList.head.next = second;
        second.next = third;

        // printing node-value
       // System.out.print("LinkedList: "+ reverseList(linkedList.head));
        linkedList.head = reverseList(linkedList.head);
        while (linkedList.head != null) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
        }
    }

        public static Node reverseList(Node head) {
//            if (head == null || head.next == null)
//                return head;
//            Node nextNode = head.next;
//            Node newHead = reverseList(nextNode);
//            nextNode.next = head;
//            head.next = null;
//            return newHead;
            Node prev = null;
            Node current = head;
            Node next = null;
            while(current!= null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            //head = prev;
            return prev;
        }
    }


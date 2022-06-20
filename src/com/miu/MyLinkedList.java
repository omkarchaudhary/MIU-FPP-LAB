package com.miu;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyLinkedList {
    //Design node
    Node head;
    int size = 0;
    class  Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //addFirst
    public void addFirst(String s){
        Node newNode = new Node(s);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //addLast
    public void addLast(String s){
        Node newNode = new Node(s);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void deleteFast(){
        if(head == null){
            System.out.println("This list is empty");
            return;
        }
        head = head.next;
        size--;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("This list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void insert(String s, int pos){
        if(pos == 0){
            addFirst(s);
        }else if(pos == size()){
            addLast(s);
        }else{
            Node newNode = new Node(s);
            Node prev = head;
            for(int i  = 1; i<pos;i++){
                prev = prev.next;
            }
            newNode.next = prev.next;
            prev.next= newNode;
        }
        size++;
    }

    public  int size(){
        return size;
    }

    public int search(String s){
        if(s.isEmpty()){
            System.out.println("Please provide valid input");
            return -1;
        }else {
            int i = 0;
            Node currentNode = head;
            while(currentNode != null){
                if(currentNode.data.equals(s)){
                    System.out.println("Input value found at index "+ i);
                    return i;
                }
                currentNode = currentNode.next;
                i++;
            }
        }
        System.out.println("Input value not found");
        return -1;
    }
    public  void printLinkedList(){
        Node currentNode = head;
        if(head == null){
            System.out.print("List is empty");
            return;
        }
        while (currentNode != null){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst("A");
        myLinkedList.printLinkedList();
        myLinkedList.addFirst("B");
        myLinkedList.addFirst("C");
        myLinkedList.addLast("D");
       myLinkedList.insert("E",2);
       myLinkedList.insert("F",0);
        myLinkedList.printLinkedList();
        myLinkedList.search("I");
    }
}

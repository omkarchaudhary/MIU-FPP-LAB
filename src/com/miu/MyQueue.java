package com.miu;

public class MyQueue {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node front;
    Node rear;
    int size = 0;

    MyQueue() {
        front = null;
        rear = null;
    }

    public void add(int data) {
        if (data < 0) return;
        Node newNode = new Node(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
            return;
        } else {
            newNode.next = rear;
            rear = newNode;
        }
        size++;

    }

    public int remove() {
        if (front == null) {
            return -1;
        }
        Node temp = front;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return temp.data;
    }

    public void printQueue() {
        while (rear != null) {
            System.out.println(rear.data);
            rear = rear.next;
        }
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        myQueue.printQueue();
        System.out.println(myQueue.remove());

    }
}

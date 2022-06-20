package com.miu;

public class MyStack {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
     Node head;
    public boolean isEmpty(){
        return head == null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public int pop(){
        if(isEmpty()) return -1;
        Node temp = head;
        head = head.next;
        return temp.data;
    }
    public int peek(){
        if(isEmpty()) return  -1;
        return head.data;
    }
    //Using LinkedList
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        while (!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }
    }
}

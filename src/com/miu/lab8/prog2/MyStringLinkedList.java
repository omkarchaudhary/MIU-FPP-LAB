package com.miu.lab8.prog2;

public class MyStringLinkedList {
    Node header;

    MyStringLinkedList() {
        header = new Node(null);
    }

    //adds to the front of the list
    public void insert(String data, int pos) {
        Node current = new Node(data);
        current.next = null;
        current.previous = null;
        if(pos == 0) {
            addFirst(data);
        }
        else{
            Node temp = header.next;
            for (int i = 1; i < pos; i++) {
                if (temp.next != null) {
                    temp = temp.next;
                }
            }
            Node last = temp.next;
            temp.next = current;
            current.previous = temp;
            current.next = last;
            last.previous = current;
        }

    }

    boolean remove(String data) {
        if(data == null) return false;
        if(header.next != null && header.next.value.equals(data)){
            //startNode = startNode.node;
            Node firstNode = header.next;
            Node secondNode = firstNode.next;
            header.next = secondNode;
            secondNode.previous = header;
            firstNode.next = null;
            firstNode.previous = null;

            return true;
        }
        Node first = header.next;
        Node second = first.next;
        while(second != null) {
            if(data.equals(second.value) && second.next != null) {
                Node temp = second.next;
                first.next = temp;
                temp.previous = first;
                return true;
            }
            else if(data.equals(second.value) && second.next == null) {
                first.next = second.next;
            }
            first = second;
            second = second.next;
        }

        return false;
    }
    public void addFirst(String item) {
        Node n = new Node(item);
        //place new node after header and
        //establish links from new node to
        //surrounding nodes
        n.next = header.next;
        n.previous = header;

        //establish links from surrounding
        //nodes to the new node
        if (header.next != null) {
            header.next.previous = n;
        }
        header.next = n;
    }

    //adds to the end of the list
    public void addLast(String item) {
        Node n = new Node(item);
        //find last node
        Node last = header;
        while (last.next != null) {
            last = last.next;
        }
        //now last.next == null
        last.next = n;
        n.previous = last;
    }

    //removes node in last position
    public void removeLast() {
        //if list is empty, return
        if (header.next == null) return;

        Node current = header;
        //traverse the list until current.next is
        //null - then remove current
        while (current.next != null) {
            current = current.next;
        }
        //now current.next == null, so remove current
        Node previous = current.previous;
        //previous is not null since current is not header
        previous.next = null;
        current.previous = null;
    }

    //determines whether the input string is in the list
    public boolean search(String s) {
        Node next = header.next;
        while (next != null && !next.value.equals(s)) {
            next = next.next;
        }
        //either next == null or next.value is s
        if (next == null) return false;
        else {//next.value.equals(s)
            return true;
        }
    }

    public String toString() {
        var sb = new StringBuffer();
        Node next = header.next;
        while (next != null) {
            sb.append(next.toString() + ", ");
            next = next.next;
        }
        var result = sb.toString().trim();
        if (result.length() == 0) return "<empty list>";
        if (result.charAt(result.length() - 1) == ',') {
            return result.substring(0, result.length() - 1);
        }
        return result;
    }

    class Node {
        String value;
        Node next;
        Node previous;

        Node(String value) {
            this.value = value;
        }

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args) {
        var list = new MyStringLinkedList();
        list.addLast("Rich");
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.addFirst("Bob");
        list.addFirst("Harry");
        list.addFirst("Steve");
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        System.out.println(list.search("Harry"));
        System.out.println(list.search("Bob"));
        list.addLast("Tom");
        list.insert("MIU", 2);
        list.remove("MIU");
        System.out.println(list);
    }
}

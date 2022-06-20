package com.miu.lab10.prog1;

public class EmployeeBST {

    private class Node {
        private Employee employee; // The data in the node
        private Node left; // Left child
        private Node right; // Right child
        // Constructors
        Node(Employee employee) {
            this(employee, null, null);
        }

        Node(Employee employee, Node left, Node right) {
            this.employee = employee;
            this.left = left;
            this.right = right;
        }
    }

    private  Node root;
    private NameComparator nameComparator;
    EmployeeBST(NameComparator nameComparator){
        this.nameComparator = nameComparator;
    }
    public void insert(Employee e){
        if(root == null){
            root = new Node(e, null,null);
        }else{
            Node node = root;
            boolean inserted = false;
            while(!inserted){
                if(nameComparator.compare(e,node.employee)<0) {
                    if (node.left == null) {
                        node.left = new Node(e, null, null);
                        inserted = true;
                    } else {
                        node = node.left;
                    }
                }else if(nameComparator.compare(e,node.employee)>0) {
                    if (node.right == null) {
                        node.right = new Node(e, null, null);
                        inserted = true;
                    } else {
                        node = node.right;
                    }
                }
            }
        }
    }

    public void printTree() {
        if (root == null)
            System.out.println("Empty tree");
        else
            printTree(root);
    }

    private void printTree(Node t) {
        if (t != null) {
            printTree(t.left);
            System.out.println(t.employee);
            printTree(t.right);
        }
    }
}

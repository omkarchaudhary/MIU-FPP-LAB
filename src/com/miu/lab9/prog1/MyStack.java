package com.miu.lab9.prog1;

public class MyStack {
	private MyStringLinkedList list;
	public MyStack() {
		list = new MyStringLinkedList();
	}
	
	public String pop() {
		//implement
		String str = peek();
		if(str == null){
			return null;
		}else {
			list.remove(0);
			return str;
		}
	}
	public String peek() {
		//implement
		if(list.get(0) == null){
			return null;
		}else {
			return list.get(0);
		}
	}
	
	public void push(String s) {
		//implement
		if(s == null) return;
		else{
			list.add(s);
		}
	}

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		System.out.println("Popping…"+stack.pop());
		System.out.println("Peeking…."+stack.peek());
		System.out.println("Popping…"+stack.pop());
	}
}

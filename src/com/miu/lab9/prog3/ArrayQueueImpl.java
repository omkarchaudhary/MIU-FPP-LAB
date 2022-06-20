package com.miu.lab9.prog3;
public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int size = 0;
	private int front = 0;
	private int rear = 0;
	public boolean isEmpty() {
		return size == 0;
	}
	public int size(){
		return size;
	}
	public void enqueue(int s){
		if(arr.length == rear){
			resize();
		}else{
			arr[rear++] = s;
			size++;
		}
	}
	public int dequeue(){
		if(isEmpty()) throw new IllegalStateException("Cannot dequeue because Queue is empty!");
		return arr[front++];
	}
	public  int peek(){
		return arr[front];
	}

	public void resize(){
		int len = arr.length;
		int newLen = len*2;
		int[] temp = new int[newLen];
		System.arraycopy(arr,0,temp,0,len);
		arr = temp;
	}
	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		
		//uncomment when ready
		for(int i = 1; i < 9; i ++)
			q.enqueue(i);
		for(int i = 1; i < 8; i ++)
			q.dequeue();
		System.out.println(q.size());
		System.out.println(q.peek());
	}
}


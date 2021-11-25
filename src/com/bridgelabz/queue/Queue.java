package com.bridgelabz.queue;

public class Queue {
	private int [] array;
	private int front;
	private int rear;
	private int capacity;
	private int count;
	
	Queue(int size) {
		array = new int[size];
		front = 0;
		rear = -1;
		capacity = size;
		count = 0;
	}

	public void enQueue(int data) {

		if (isFull()) {
			System.out.println("Overflow");
			return;
		}

		System.out.println("queue: " + data);

		rear = (rear + 1) % capacity;
		System.out.println("rear : " + rear);
		array[rear] = data;
		count++;
	}

	public void deQueue() {
		if(isempty()) {
			System.out.println("queue is empty");
			return;
		}
		System.out.println("removing the element from queue");
		front = (front+1)%capacity;
		System.out.println("Front : " + front);
		count--;
	}

	public boolean isempty() {

		return size()==0;
	}

	public boolean isFull() {

		return size() == this.capacity;
	}

	public int size() {
		return count;
	}
}
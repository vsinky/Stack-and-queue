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

	void enQueue(int data) {

		if (isFull()) {
			System.out.println("Overflow\nProgram Terminated");
			return;
		}

		System.out.println("adding " + data);

		rear = (rear + 1) % capacity;
		array[rear] = data;
		count++;
	}

	public boolean isFull() {
		return (size() == capacity);
	}

	public int size() {
		return count;
	}

	void display() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " -> ");
		}
	}
}

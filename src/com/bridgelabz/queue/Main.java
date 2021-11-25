package com.bridgelabz.queue;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue Problems");
		Queue queue = new Queue(5);
		queue.enQueue(56);
		queue.enQueue(30);
		queue.enQueue(70);
		queue.deQueue();
		queue.deQueue();
		System.out.println(queue.isFull());
	}
}


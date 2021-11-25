package com.bridgelabz.stacks;

public class Stack {
	private static final int MAX = 10;

	private int[] array;  
	private int top;

	public Stack() {
		array = new int[MAX];
		top = -1;   
	}

	public Stack(int length) {
		this.array = new int[length];
		top = -1;
	}

	public boolean push(int data) {

		if (isFull()) { 
			System.out.println("Stack is overflow");
			return false;
		}
		array[++top] = data;  
		System.out.println("pushed data into stack " +data);
		return true;

	}

	public boolean isFull() {

		return top >= array.length - 1; 
	}
}

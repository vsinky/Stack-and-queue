package com.bridgelabz.stacks;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue Problems");
		Stack stack = new Stack(3);
		stack.push(56);
		stack.push(30);
		stack.push(70);

		stack.push(80);

		System.out.println(stack.isFull());

	}

}

package com.kademika.day7.hw6;

class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.push("test1");
		stack.push("test2");
		stack.push("test3");
		stack.push("test4");
		stack.push("test5");
		stack.push("test6");
		printStack(stack);
		String poped = (String) stack.pop();
		System.out.println(poped);
		printStack(stack);
		String picked = (String) stack.peak();
		System.out.println(picked);
		printStack(stack);
		
	}

	public static void printStack(Stack stack) {
		for (Object o : stack) {
			System.out.print( (String) o + " ");
		}
		System.out.println();
	}

	
}
	

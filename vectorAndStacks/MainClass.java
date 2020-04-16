package vectorAndStacks;

import java.util.Stack;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		MyStack<Integer> stack = new MyStack();// generic

			stack.push(12);
			stack.push(24);
			stack.push(34);
			
			int popped = stack.pop();
			
			System.out.println(popped);
			

//			popped = stack.pop();
//			
//			popped = stack.pop();
//			
			int peeked = stack.peek();
			System.out.println(peeked);
	}

}

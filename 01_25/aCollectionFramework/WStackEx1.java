package aCollectionFramework;

import java.util.Stack;


public class WStackEx1 {

	public static void main(String[] args) {
		String[] groupA = { "K3", "k5", "k7","k9", "G70" ,"G80" ,"G90"};
		Stack<String> stack = new Stack<String>();
		for (String n : groupA)
			stack.push(n);
		
		while(!stack.isEmpty())
			System.out.println(stack.pop());
		
	}

}

package collectionframework;

import java.util.Stack;

public class TestStack {
public static void main(String[] args) {
	
	Stack s = new Stack();
	s.push(12);
	s.push(32);
	s.push('h');
	s.push("java");
	
	
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
	 
	System.out.println(s);
	
	
	
}
}
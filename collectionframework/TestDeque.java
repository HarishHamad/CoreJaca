package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class TestDeque {
public static void main(String[] args) {
	
	Deque d = new ArrayDeque();
	
	d.add(12);
	d.add(5.6);
	d.addFirst(6);                 //Add fist & Add last
	d.addLast(98);
	
	System.out.println(d);
	
	
	
	Deque d1 = new LinkedList();
	
	d1.add(56);
	d1.add(7.8);                //print as it is
	d1.addFirst(5);
	d1.add(90);
	
	System.out.println(d1);
}
}

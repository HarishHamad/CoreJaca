package collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListCollection {
	public static void main(String[] args) {
		List<Comparable> a = new ArrayList();

		a.add(12);
		a.add('a');
		a.add(3.7);
		a.add("java");

		// a.clear();

		//System.out.println(a);

	

	List<Object> l = new LinkedList<>();
	l.add(12);
	l.add(16.2);
	l.add('b');
	l.add("rays");
	
	//l.remove(0);
	//l.removeAll(l);
	
	System.out.println(l);
	
	
	Vector v = new Vector<>();
	
	v.add(78);
	v.add(65.6);
	v.add('g');
	v.add("tech");
	v.contains(l);

	
	System.out.println(v);
	
	
	}
}

package collectionframework;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class TestQue {
	public static void main(String[] args) {

		PriorityQueue p = new PriorityQueue();

		p.add(12);
        p.add(12);
        p.add(13);                  //first me jo datatype lege vhi datatype sbhi me lege
        p.add(56);                 //follow accending order
        p.add(80);
        
        System.out.println(p);
		
        
        
        List<Object> l = new LinkedList<>();
    	l.add(12);
    	l.add(12);                    //in the form of list
    	l.add('b');
    	l.add("rays");
    	
    	System.out.println(l);
	}
}

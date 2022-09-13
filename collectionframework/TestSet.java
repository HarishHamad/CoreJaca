package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
public static void main(String[] args) {
	
	Set s = new HashSet();
	
	s.add(12);
	s.add('y');
	s.add(7.8);                    //no duplicate value
	s.add("indore");               // does not follow any order
	
	System.out.println(s);
	
	
	Set s1 = new TreeSet();
	s1.add(12);
	s1.add(8);
	s1.add(80);                    //no duplicate value
	s1.add(78);               //follow accending order
	
	System.out.println(s1);
	
	
	Set s2 = new LinkedHashSet();
	s2.add(12);
	s2.add(8);                        //as it is print
	s2.add(80);                       //no duplicate value
	s2.add(78);               
	
	System.out.println(s2);
	
}
}

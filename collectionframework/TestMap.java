package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
public static void main(String[] args) {
	HashMap m = new HashMap();
	
	m.put(1101, 12);
	m.put(1102, 'a');
	m.put(1103, "java");
	m.put(1104, 12.3);
	
	m.keySet();
	
	System.out.println(m);
}
}

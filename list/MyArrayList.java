package list;

import java.util.ArrayList;
import java.util.List;


public class MyArrayList {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList();
		
		fruits.add("Apple");
		fruits.add("Banana");
		
		ArrayList<Integer> marks = new ArrayList();
		
		Double x = 45.0;
		
		Pair<String, Integer> p1 = new Pair("Anuj", 457);
		Pair<Boolean, String> p2 = new Pair(true, "Hello");
		
		p1.getDescription();
		p2.getDescription();
	}

}

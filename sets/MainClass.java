package sets;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		
		Set<Integer> x = new HashSet<>();
		x.add(12);
		x.add(23);
		x.add(33);
		
		Set<Integer> y = new HashSet<>();
		y.add(12);
		y.add(35);
		y.add(67);
//		x.addAll(y);// union
		
		x.retainAll(y);
		
		System.out.println(x);
		
//		Set<String> fruits = new HashSet<>();
//		
//		fruits.add("apple");
//		fruits.add("banana");
////		fruits.add("kiwi");
//		
//		System.out.println(fruits.add("banana"));
//		System.out.println(fruits.add("kiwi"));
//		
//		System.out.println("fruits");
		
	}

}

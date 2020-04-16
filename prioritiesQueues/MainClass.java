package prioritiesQueues;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
		
//		PriorityQueue<String> pq = new PriorityQueue<>();
//		
//		pq.add("Mango");
//		pq.add("Anar");
//		pq.add("Kiwi");
//		pq.add("Orange");
//		
//		System.out.println(pq);
//		
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(450);
		pq.add(100);
		pq.add(12);
		pq.add(1000);
		System.out.println(pq);
		

		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
				
	}

}

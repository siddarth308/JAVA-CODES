package queue;

public class MainClass {

	public static void main(String[] args) {
		
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(12);
		mq.enqueue(1256);
		mq.enqueue(142);
		mq.enqueue(125);
		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		mq.enqueue(12555);
		System.out.println(mq.dequeue());
		
//		q.add(12);
//		q.add(23);
//		q.add(34);
//		
//		System.out.println(q);
//		
//		System.out.println(q.remove());
//		System.out.println(q.remove());
// 
//			System.out.println(q.element() );
//	}

}
}

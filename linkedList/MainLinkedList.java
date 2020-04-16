 package linkedList;

 import java.util.*;
public class MainLinkedList {

	public static void main(String[] args) {
	
		MyLinkedList myLL = new MyLinkedList();
		
//		myLL.add(12);
//		myLL.add(56);
//		
		for(int i=0; i<10; i++) {
		myLL.add(i);
		}
		myLL.print();
	}

}

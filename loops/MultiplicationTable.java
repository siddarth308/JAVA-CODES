package loops;

import java.util.Scanner;

public class MultiplicationTable {
	

	public static void main(String[] args) {
// multiplication table from for loop
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter no.");
		 int num=sc.nextInt();
		 for(int i = 1; i <= 10; i++) {
			 System.out.println(num*i);
		 }
}
}
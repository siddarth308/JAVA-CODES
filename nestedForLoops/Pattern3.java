package nestedForLoops;

import java.util.Scanner;

public class Pattern3 {
//	* * * * 
//	  * * * 
//	    * * 
//	      * 

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++) {//2(i-1) now i am printing just i-1 times and printing just 2 spaces
				System.out.print("  ");
			}  
		for(int j= 1; j<=n-i+1; j++) {
			System.out.print("* ");
		}
		System.out.println();
		}
		


	} 

}

package nestedForLoops;

import java.util.Scanner;

public class Pattern6 {
//    *  
//  *  *  
// *  *  *  
//*  *  *  *  

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) { // spaces will be printed 2(n-1) times but will print 2 spaces together
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*  ");// giving 2 spaces after star
			}
			System.out.println();
		}
	}
}
		
//	      1  
//	      2  3  
//	    4  5  6  
//	  7  8  9  10  

//		int number=1;
//		for(int i=1; i<=n; i++) {
//		for(int j=1; j<=n-i; j++) { 
//				System.out.print("  ");
//			}
//		for(int j=1; j<=i; j++) {
//		System.out.print(number+"  ");
//		number++;
//		}
//			System.out.println();
//		 
//	}
//
//}
//}

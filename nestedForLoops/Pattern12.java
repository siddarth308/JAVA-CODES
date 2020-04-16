package nestedForLoops;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	      
		 int n =sc.nextInt();
	        int rows = 2 * n - 1;        
	        for (int i= 1; i<= rows ; i++)
	        {
	            for (int j=i; j <rows ;j++)            
	        {
	                System.out.print(" ");
	            }
	            for (int k=1; k<=i;k++) { System.out.print("*"); } System.out.println(""); } for (int i=rows; i>=1; i--)
	        {
	            for(int j=i; j<=rows;j++)
	            {
	                System.out.print(" ");
	            }
	            for(int k=1; k<i ;k++) 
	            {
	                System.out.print("*");
	            }
	            System.out.println("");
	 
	        }
	}
}
	
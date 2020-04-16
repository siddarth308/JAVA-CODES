package nestedForLoops;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		int rows = 2*n-1;
		
		for(int i=1; i<=rows; i++) {
			
			if(i<=n) {
				for(int j=1; j<=n-i; j++) {
					System.out.print("* ");
				}
					for(int k=1; k<=i; k++) {
						System.out.print("  ");
						
					}
					
					for(int o=1; o<=n-i; o++) {
						System.out.print("* ");
					}
					System.out.println();
				} else {
					for(int j=1; j<=(7+i)-rows; j++) {
						System.out.print("* ");
					}
					for(int k=1; k<=rows-(2*i); k++) {
						System.out.print("  ");
					}
					for(int o=1; o<=(7+i)-rows; o++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				
			}
			
		}
		

	}



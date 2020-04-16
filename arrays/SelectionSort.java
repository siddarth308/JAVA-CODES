package arrays;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a [] = new int[n];
		for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
		
		int l = a.length;
		
		
		for(int i=0; i<l-1; i++) {
			
			int minInd = i;
			for(int j=i; j<l; j++) {
				
				if(a[j] < a[minInd]) {
					minInd = j;
				}
			}
			
			int temp=a[i];
			a[i] = a[minInd];
			a[minInd] = temp;
		}
		
		for(int e: a) {
			System.out.print(e +" ");
		}

	}

}

package arrays;

import java.util.Scanner;

public class Rotation {

	 public static void main(String []args) {

		 System.out.println("Enter no of values");
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	     
	     
	      int [] values = new int [n];
	     
	      System.out.println("Enter values");
	        for(int i=0; i<n; i++) {
	            values[i] = sc.nextInt();
	        }
	     
	       
	        for(int i=n-1; i>=0; i--) {
	            System.out.print(values[i] + " ");
	        }
	  
	  }
	}

//static int[] rotleft(int[] a,int d) {
//
//    int size = a.length;
//    int[] rotated_arr = new int[size];
//
//    int i = 0;
//    int rotate_index=d;
//
//    while(rotate_index < size) {
//        rotated_arr[i] = a[rotate_index];
//        i++;
//        rotate_index++;
//    }
//    rotate_index=0;
//    while(rotate_index < d) {
//         rotated_arr[i] = a[rotate_index];
//        i++;
//        rotate_index++;
//    }
//    return rotated_arr;
//}



	   
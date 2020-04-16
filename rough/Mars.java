package rough;

import java.util.Scanner;

public class Mars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        String s = sc.next();
	        int l = s.length();
	        
	        int count = 0;
	        for(int i=0; i<s.length(); i=i+3) {
	            if (s.charAt(i)!= 'S')
	            count++;
	            if (s.charAt(i+1)!= 'O')
	            count++;
	            if (s.charAt(i+2)!= 'S')
	            count++;
	        }
	        System.out.println(count);
	    }
	}



package rough;

import java.util.Scanner;

public class Rough1 {

	public static void main(String[] args) {
	
//
//		 Scanner sc = new Scanner(System.in);
//	        String s = sc.next();
//	        int count = 0;
//	        for(int i=0; i<s.length(); i++) {
//	            
//				if(Character.isUpperCase(s.charAt(i))) {
//	                count++;
//	            }
//	        }
//	        System.out.println(count+1);
//	    }
		
  

	         Scanner sc = new Scanner(System.in);
	         
	         int numCases = sc.nextInt();
	 		sc.nextLine();
	 		for(int t = 0; t < numCases; t ++)
	 		{
	 			
	 		
	            String s = sc.next();
	            if(s.length()%2 == 1) {
	                System.out.println("-1");
	            } else {
	            	String s1 = s.substring(0, s.length()/2);
	            	String s2 = s.substring(s.length()/2, s.length() );
	            	int[] count = new int[26];
	            	for(int i=0; i< s1.length(); i++) {
	            		count[s1.charAt(i) - 'a'] ++;
	            	}
	            	int change = 0;
	            	for(int i=0; i< s2.length(); i++) {
	            		if (count[s2.charAt(i) - 'a'] >0) {
	            			count[s2.charAt(i) - 'a']--;
	            			}
	            		else {
	            			change++;
	            		}
	            	}
	            	System.out.println(change);
	            }
	            
	}
}
}

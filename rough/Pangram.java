package rough;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
	        s = s.replace(" ",""); 
	        s = s.toUpperCase();
	        char y[] = s.toCharArray();
	        int size = y.length;
	        
	        int a[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		int i=0;  
		while(i != size)
			{ 
			int index = y[i]-65;//ASCII
			a[index] = 1;
			i++;
			}
		
			i=0;
			while(i!=26) 
			{
				if(a[i] == 1) {
					i++;
				}
				else {
					System.out.println("not pangram");
					System.exit(0);
				}
				
			 } System.out.println("pangram");
		
	}

}

		
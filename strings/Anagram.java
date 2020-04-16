package strings;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String y = sc.next();
		
	
		
		
		boolean isAnagram = true;
//		
//		boolean visited[] = new boolean[b.length()];
//		
//		if(a.length() == b.length()) {
//		
//			for(int i=0; i<a.length(); i++) {
//				char c= a.charAt(i);
//				isAnagram = false;
//				for(int j=0; j<b.length(); j++) {
//					if (b.charAt(j) == c && !visited[j]) {
//						visited[j] = true;
//						isAnagram = true;
//						break;
//					}
//				}
//		
//			if(!isAnagram) {
//				break;
//			}
//		}
//		
		
		int al[] = new int [256];
		int bl[] = new int [256];
		
		for(char c: x.toCharArray()) {
			int index = (int) c;
			al[index]++;
		}
		
		for(char c: y.toCharArray()) {
			int index = (int) c;
//			bl[index]++;
			al[index]--;
		}
		
		for(int i=0; i<256; i++) {
//			if(al[i] != bl[i]) {
			if(al[i] != 0) {
				isAnagram = false;
				break;
			}
		}	
			
		if(isAnagram) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	

}


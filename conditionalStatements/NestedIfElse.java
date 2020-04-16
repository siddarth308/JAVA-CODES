package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int a=1 , b=8, c=16;
		int result =0;
		
		if (a>b) {
			if (a>c) {
				result = a;
				} else { 
					result = c;
				} 
			}else {
				if ( b > c ) {
					result = b;}
				
				else { result = c; }
			}
				
				System.out.println("largest number is " + result);
				}
				
			}
				
		
		

	



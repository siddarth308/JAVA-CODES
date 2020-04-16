package operator;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		//AND--->//5 -> 101;
		//6 -> 110;
		//and of 5,6     100)
		
		//OR--->//10->1010
		        //13->1101
		        //    1111

		//int a=5;
		//int b=6;
		int a=10;
		int b=13;
		
		//int c= a & b;//&-->AND
		//int c= a | b;
		int c= b >> 1;
		System.out.println(c);
	}

}

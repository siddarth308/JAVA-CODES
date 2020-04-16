package conditionalStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first no.");
		int a = sc.nextInt();
		
		System.out.println("Enter second no.");
		int b = sc.nextInt();
		
		System.out.println("Enter operation");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		int result=0;
		switch(operation) {
		case '+':
			result = a+b;
			break;
		case'-':
			result = a-b;
			break;
		case'*':
			result=a*b;
			break;
		case'/':
			result=a/b;
			default:
				System.out.println("wrong operation");
		}
	System.out.println("The Result Is " + result);	
		
		}
		
}



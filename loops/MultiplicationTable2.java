package loops;

public class MultiplicationTable2 {

	public static void main(String[] args) {
		// multiplication table from nested for loops

		 for(int j = 1; j <= 20; j++) {
			 
			 int tableof = j ;
			 for (int i = 1; i <= 10; i++) {
				 System.out.print(tableof * i +" ");
			 }
			 System.out.println( );
		 }
		 
	}

}

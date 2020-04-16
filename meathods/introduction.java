package meathods;

public class introduction {

	public static void main(String[] args) {
		
		int firstnumber = 34;
		int secondnumber = 25;
		int result = maxOf(firstnumber, secondnumber);
		
		maxOf(100, 200);
		
		maxOf(5);
		
		maxOf(2, 4);
		System.out.println(result);
		 
		sayHI();
		
		sayHI();
	}
		static int maxOf(int a, int b) {
			if(a>b) {
				return a;
			} else {
				return b;
			}
		}
		
		static void maxOf(float d) {
		
		}
		static void sayHI() {
			System.out.println("HI");
			System.out.println("Good Morning");
		}
	}



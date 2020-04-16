package rough;

import java.util.Scanner;
import java.time.LocalDate;

public class Calender {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String month = sc.next();
		int mm = sc.nextInt();
		
		
		int dd = sc.nextInt();
		
		
		int yy = sc.nextInt();

		LocalDate dt = LocalDate.of(yy, mm, dd);
		System.out.println(dt.getDayOfWeek());
	}

}

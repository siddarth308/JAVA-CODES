package oops;

class vehicle {
	 int wheels;
	 int headlights;
	 String color; 
	
	 vehicle(int wheels) {
		 this.wheels =wheels;
		 headlights = 2;
	 }
//	vehicle () { 
//		wheels = 4;
	
vehicle(int wheels, String color) {
	this.wheels = wheels;
	this.color = color;
	headlights = 2;
}

public class MyConstructor {
	
	MyConstructor() {
		System.out.println("Object is created");
	}

	public static void main(String[] args) {
		
//		MyConstructor obj = new MyConstructor();
		
		vehicle car = new vehicle(4);
		vehicle scooty = new vehicle(2);
		
		System.out.println(scooty.wheels + " wheels & " + scooty.headlights + " headlights");
		
	
	}

}
}
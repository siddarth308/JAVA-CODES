package oops;

class cat {
	boolean hasFur; // properties
	String color, breed;
	int legs, eyes;

	public void sleep() { // behaviour
		System.out.println("Cat is sleeping");
	}
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void discription() {
		System.out.println("My cat has " + legs + " legs and " + eyes + " eyes");
	}
}

class dog {
	boolean hasFur;
	String color,breed;
	int legs, eyes;
	
	public void color() {
		System.out.println("My dogs color is "+ color);
	}
	public void discription() {
		System.out.println("My dog color is "+ color+ " has "+ legs +" legs and "+ eyes +"eyes");
		
	}
	
	
}

public class MainClass {

	public static void main(String[] args) {
		
//		cat cat1 = new cat();
//		cat cat2 = new cat();
//		
//		cat1.legs = 4;
//		cat1.eyes = 2;
//		
//		cat2.legs = 3;
//		cat2.eyes =1;
//		cat1.eat();
//		cat2.sleep(); 
		
//		cat1.discription();
//		cat2.discription();
		
		dog dog1 = new dog();
		dog dog2 = new dog();
		
		dog1.color ="brown";
		dog2.color= "white";
		dog1.legs =4;
		dog1.eyes=2;
		dog2.legs=3;
		dog2.eyes=2;
		
		dog1.discription();
		dog2.discription();
		
	}

}

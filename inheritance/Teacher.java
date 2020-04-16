package inheritance;

public class Teacher extends Person {

	public void teach() {
		System.out.println(name + " is teaching");
	}
	
	public void eat() {
		super.eat(); 
		System.out.println("Teacher " + name + " Is Eating");
	}

	public static void laughing() {
		System.out.println("Teacher is laughing");
	}
}

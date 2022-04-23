package JavaSessionsPart2;

public class StaticAndNonStaticConcepts {
	
	String name = "Prabhu"; // non static global variable
	static int age = 25; // static global variable
	public static void main(String[] args) {
		// We used to call non static methods or variables using object reference.
		// static methods or variables can be called directly or using class name
		
		//1.Direct calling
		sum();
		System.out.println(age);
		
		//2.calling by class name
		StaticAndNonStaticConcepts.sum();		
		System.out.println(StaticAndNonStaticConcepts.age);
		
		StaticAndNonStaticConcepts obj = new StaticAndNonStaticConcepts();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can we access static method/var using object reference? Yes
		obj.sum(); // It is not advisable
	}

	public void sendMail() { //non static method
		System.out.println("Send mail method");
	}
	
	public static void sum() { //static method
		System.out.println("Sum Method");
	}
}

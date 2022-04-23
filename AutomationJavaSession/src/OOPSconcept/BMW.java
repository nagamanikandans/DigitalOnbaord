package OOPSconcept;

public class BMW extends Car {
	
	//when same method is present in parent class as well as child class with same name and 
	//same number of arguments is called method overriding.
	public void start() { // priority
		System.out.println("BMW ---> Start");
	}
	
	public void safety() {
		System.out.println("BMW --> Safety");
	}
}

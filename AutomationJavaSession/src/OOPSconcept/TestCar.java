package OOPSconcept;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW b = new BMW();
		b.start(); // Method over riding concept. Compile time polymorphism. 
		//In run time JAVA will decide which method needs to called.
		b.safety();
		b.stop();
		b.refuel(); 
		b.engine();
		b.autoMachine();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		// c.safety --> Because car class reference can't access child class method
		
		//Top - Casting
		Car c1 = new BMW(); // Dynamic polymorphism or run time polymorphism.
		//Child class object can be refferred by parent class reference variable.
		c1.start(); //BMW --> Overriding concept. Preference will be given to BMW start method.
		c1.stop();
		c1.refuel();
		//c1.safety --> You can access my object but you can't take my properties or methods
	}

	//Polymorphism in Oops
	// Inheritance
	// Types of polymorphism
	//Method overriding
	
}

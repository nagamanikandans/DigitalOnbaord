package JavaSessionsPart2;

public class Bus {
	//class variables
	int model;
	int wheel;
	
	public static void main(String[] args) {
		//new Bus() = Object of an Bus class
		// a, b , c --> Object reference variables
		// new keyword is used to create object
		//Object creation
		Bus a = new Bus();
		Bus b = new Bus();
		Bus c = new Bus();
		
		//storing object values in their respective references
		a.model = 2020;
		a.wheel = 4;
		
		b.model = 2021;
		b.wheel = 4;
		
		c.model = 2013;
		c.wheel = 6;
		
		System.out.println("Before Shifting references");
		//retrieving object values
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		System.out.println("After Shifting references");
		
		a = b;
		b = c;
		c = a;
		
		a.model = 10;
		System.out.println(a.model); // ouput will be 10
		c.model = 20;
		System.out.println(a.model); //output will be 20
		System.out.println(b.model); 
		System.out.println(b.wheel);
		
		
	}

}

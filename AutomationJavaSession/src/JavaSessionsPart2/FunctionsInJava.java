package JavaSessionsPart2;

public class FunctionsInJava {

	public static void main(String[] args) { //main method --> Which will be the starting point of the execution
		// TODO Auto-generated method stub
		
		FunctionsInJava obj = new FunctionsInJava();
		// one object will be created, obj is the reference variable reffering the object
		// after creating the object,  the copy of all non static methods will be given to this object
		obj.test();
		int auto = obj.automation();
		System.out.println(auto);
		
		String s1 = obj.str();
		System.out.println(s1);
		
		int div = obj.division(30, 10);
		System.out.println(div);
		
		int div1 = obj.division(30, 3);
		System.out.println(div1);
		
		int div2 = obj.division(100, 5);
		System.out.println(div2);
	}

	//non static methods or fucntions
	//void --> It doesn't return value	
	//return type = void
	public void test() { //no input and no output
		System.out.println("Test Method");
	}
	
	//return type = int
	public int automation() { //no input and some output
		System.out.println("Automation Method");
		int a = 10;
		int b = 20;
		int c = a+b;		
		return c;	
		
	}
	
	//return type = string
	public String str() { //no input and some output
		System.out.println("str Method");
		String s = "Automation Selenium Session";
		return s;
	}
	
	//retun type = int
	// x, y --> input parameters or arguments
	public int division(int x, int y) { //some input and some output
		System.out.println("division Method");
		int d = x/y;
		return d;
	}
}

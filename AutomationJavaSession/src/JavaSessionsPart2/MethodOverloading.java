package JavaSessionsPart2;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 15);
	}
	public static void main(int p) {
		MethodOverloading obj1 = new MethodOverloading();
		obj1.sum();
	}
	
	public static void main(int p,int q) {
		
	}
	// We can overload main method also.
	// Cannot have a method inside method
	//Duplicate methods --> same method name with same number of arguments are not allowed
	//Method overloading --> When the method name is same with different parameters or arguments 
	//within the same class
	public void sum() {	//no parameters or arguments	
		System.out.println("SUM Method --> Zero Parameters");
	}
	
	public void sum(int i) { //1 parameter and arguments
		System.out.println("SUM Method --> One Parameter");
		System.out.println(i);
	}
	public void sum(double d) { // It will allow this. Because datatypes are different
		
	}
	public void sum(int k, int l) {// 2 parameteres and arguments
		System.out.println("SUM Method --> Two Parameter");
		System.out.println(k+l);
	}
}

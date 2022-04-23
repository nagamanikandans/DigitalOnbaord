package JavaSessionsPart2;

public class B extends A {
	
	public B() { // super keyword is used to refer parent class instance variable
		super(10); //one parameter
		System.out.println("Child class constructor");
	}
	
	public B(int i, int j) {
		super(10,20);
		System.out.println(i);
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new B(1,2);
	}
}

package JavaSessionsPart2;

public class LocalGlobalVariables {

	//Global variables or class variables
	String name = "Prabhu";
	int age = 25;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10; // i is the local variable for main method
		System.out.println(i);
		
		LocalGlobalVariables obj = new LocalGlobalVariables();
		
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

	public void sum() {
		int i = 15; // i and j are the local variables for sum method
		int j = 20;
	}
}

package JavaSessionsPart2;

public class ConstructorConcept {
	
	String name; //Global variables or class variables
	int age;
	
	 public ConstructorConcept(){ //zero parameter
		System.out.println("Zero parameter constructor");
	}
	
	public ConstructorConcept(int i) { //1 parameter
		System.out.println("One Parameter Constrcutor");
		System.out.println(i);
	}
	
	public ConstructorConcept(int i,int j) { //2 parameter
		System.out.println("Two Parameter Constrcutor");
		System.out.println(i + " "+j);
	}
	//this Keyword
	
	public ConstructorConcept(String name, int age) { //local variable. Used inside a function, method
		this.name = name; // this.classVar = localVar
		this.age  = age;
//		System.out.println(name);
//		System.out.println(age);
	}
	
	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,12);
		
		ConstructorConcept obj3 = new ConstructorConcept("Tom",25);
		//ConstructorConcept obj4 = new ConstructorConcept("Manikadan",27);
		System.out.println(obj3.name);
		System.out.println(obj3.age);
		
		ConstructorConcept obj4 = new ConstructorConcept("Manikandan",28);
		System.out.println(obj4.name);
		System.out.println(obj4.age);
	}

}

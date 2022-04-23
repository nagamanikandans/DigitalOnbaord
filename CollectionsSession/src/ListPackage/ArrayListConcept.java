package ListPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		int a[] = new int[3]; //Array size is fixed --> Static Array. 
		
		//dynamic array --> ArrayList
		// 1. can accept duplicates values/elements
		// Array list can act as a list only
		// Maintains insertion order
		// manipulation of data slow
		ArrayList ar = new ArrayList(); //non generic
		
		ar.add(10); //0
		ar.add(20); //1
		ar.add(30); //2
		
		System.out.println(ar.size()); // output will be 3
		
		ar.add(40); //3
		ar.add(50); //4
		ar.add(60); //5
		ar.add(10); //6
		ar.add("Rohit"); //7
		
		System.out.println(ar.size()); // output will be 6
		System.out.println(ar.get(4)); //40
		
		// TO print all the value from arraylist: 
		//1. for loop
		//2. Iterator
		
		for(int i = 0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//non generic and generic
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>(); //Integer generic arraylist
		ar1.add(10);
		//ar1.add("Rohit1"); --> Not allowed
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Selenium");
		//ar2.add(1200);  --> Not allowed
		
		// Employee class object
		Employee e1 = new Employee("Prabu",27,"QA");
		Employee e2 = new Employee("Tom",28,"Dev");
		Employee e3 = new Employee("Peter",29,"Admin");
		Employee e4 = new Employee("Rohit",26,"Testing");
		
		//Array list create
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1); //0 --> "Prabu" 27 "QA
		ar4.add(e2); //1 --> 
		ar4.add(e3); //2
		ar4.add(e4); //3
		
		//Iterator to traverse values
		Iterator<Employee> it = ar4.iterator(); ///syntax for iterator
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		System.out.println("***************************************************************");
		
		//addAll --> Method
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("test");
		ar5.add("selenium");
		ar5.add("QTP");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("dev");
		ar6.add("java");
		ar6.add("javaScript");
		
		ar5.addAll(ar6); // addAll syntax
		
		for(int i = 0; i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("***************************************************************");
		
		//removeAll --> Method
		ar5.removeAll(ar6); //removeAll syntax
		
		for(int i = 0; i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("***************************************************************");
		
		//retainAll --> Method
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("test");
		ar7.add("selenium");
		ar7.add("QTP");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("test");
		ar8.add("Java");
		
		ArrayList<String> ar9 = new ArrayList<String>();
		ar9.add("test");
		ar9.add("Testing");
		
		System.out.println(ar7.size());
		
		ar7.retainAll(ar8); // Syntax for retainALL --> To fetch common values
		
		for(int i = 0; i<ar7.size();i++) {
			System.out.println(ar7.get(i));
		}
		
		System.out.println(ar7.size());
	}

}

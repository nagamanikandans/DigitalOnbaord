package JavaSessions;

import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Adv --> Random values can be stored
		//		Optimization
		//Disadvantage --> Size of array can't be increased at run time. To overcome this we will use Java collection framework
		//Array: To store similar data types
		//1.int array
		// lowest bound/index = 0
		// upper bound/index = size of the array - 1
		int i[] = new int[4];
		i[0] = 60;
		i[1] = 50;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		//System.out.println(i[4]); // Array index out of exception
		
		System.out.println(i.length);
		Arrays.sort(i);
		System.out.println("After Sorting");
		for (int q = 0; q<i.length;q++) {
			System.out.println(i[q]);
		}
		for(int j = 0; j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		//2.double array		
		double d[] = new double[3];
		d[0] = 12.22;
		d[1] = 13.44;
		d[2] = 40.01;
		
		System.out.println(d[1]);
		
		//. char array
		char c[] = new char[3];
		c[0] = 'A';
		c[1] = 'B';
		c[2] = '#';
		
		System.out.println(c[2]);
		
		//boolean array
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		//String array
		String s[] = new String[3];
		s[0] = "test";
		s[1] = "selenium";
		s[2] = "automation session";
		
		System.out.println(s.length);
		System.out.println(s[1]);
		
		// 6. Object Array
		// It is used to store different data types values(Ex: int,string combinations)
		
		Object obj[] = new Object[6];
		obj[0] = "Suresh"; //String
		obj[1] = 25; // int
		obj[2] = 20000; // int
		obj[3] = "04/04/1993"; //String
		obj[4] = 'M'; // char
		obj[5] = "12.44"; // double
		
		System.out.println(obj[5]);
		System.out.println(obj[3]);
		
		
	}

}

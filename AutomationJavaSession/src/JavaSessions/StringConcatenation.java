package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//+ --> Concatenation Operator
		//println --> is used to print on the console with new line.
		//print --> is just used to print on the console.
		String str1 = "Automation";
		String str2 = "Session";
		
		System.out.println(str1+str2);
		
		int a = 10;
		int b = 5;
		
		System.out.println(a+b);
		
		System.out.print(str1);
		System.out.print(str2);
		System.out.print(a);
		System.out.println(b);
		System.out.println(a);
		
		System.out.println(a+str1+str2);
		System.out.println(a+str1+str2+b);
		System.out.println(a+b+str1+str2);
		System.out.println(str1+str2+(a+b));
		System.out.println(str1+str2+a+b);
		System.out.println(a+b+str1+str2+a+str1+b+str2);
		
		double c = 12.33;
		double d = 10.33;
		
		System.out.println(c+d);
		System.out.println(str1+str2+(c+d));
		System.out.println(str1+str2+c+d);
		
		System.out.println("The value of c is:"+c);
		System.out.println("The value of d is:"+d);
		System.out.println("Addition of c and d is:"+(c+d));
	}

}

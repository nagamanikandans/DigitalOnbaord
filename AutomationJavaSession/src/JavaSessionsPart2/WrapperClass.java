package JavaSessionsPart2;

public class WrapperClass {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x+20);
		
		//data conversion: String to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//String to double
		String y = "12.11";
		System.out.println(y+10);
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to Boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to String
		int j = 200;
		String str = String.valueOf(j);// 200
		System.out.println(str);
		
		String str1 = "100A"; //Combination of integer and char
		int v = Integer.parseInt(str1);
		System.out.println(v); //NumberFormatException
		
	}
	
	}

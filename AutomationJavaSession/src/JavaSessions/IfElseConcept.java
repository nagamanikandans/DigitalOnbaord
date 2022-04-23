package JavaSessions;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 30;
		int b = 20;
		
		if(b>a) { 
			System.out.println("b is greater than a"); //False
		}else {
			System.out.println("a is greater than b"); //True
		}
		
		//comparison operators in JAVA
		// <,>, <= , >= , == , !=
		
		int c = 50;
		int d = 40;
		
		if(c==d) { //fail
			System.out.println("C and D are equal");
		}else {
			System.out.println("C and D are not equal");
		}
		
		//write a logic to find out the highest number
		
		int a1 = 40;
		int b1 = 80;
		int c1 = 60;
		
		//nested if-else
		if(a1>b1 & a1>c1) { //False False
			System.out.println("a1 is greatest");
		}else if(b1>c1) { //True
			System.out.println("b1 is greatest");
		}else {
			System.out.println("c1 is greatest");
		}
		
		//write a logic to find out lowest number
		
		int x1 = 10;
		int y1 = 5;
		int z1 = -2;
		
		if(x1<y1 & x1<z1) {
			System.out.println("x1 is lowest");
		}else if(y1<z1){
			System.out.println("y1 is lowest");
		}else {
			System.out.println("z1 is lowest");
		}
	}

}

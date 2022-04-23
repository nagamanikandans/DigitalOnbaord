package JavaSessions;

public class LoopsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 to 10 print number
		
		//1. While loop
		// disadvantage: it will generate infinite loop if you are not providing incremental/ decremental part
		int i = 1; //initialize
		while(i<=10) { //condition
			System.out.println(i); // output or printing part
			i = i + 1; // incremental/ decremental 
		}
		
		System.out.println("***************");
		//1<=10
		//1
		// i = 1 + 1; i = 2;
		// 2
		// 3
		// 4
		// 5
		// 6
		// 7
		// 8
		// 9
		// 10
		// i = 10 + 1 ; i = 11
		// 11<=10 // Fail
		
		//2. for loop
		// j = j + 1 --> j++
		// J = j - 1 --> j--
		
		for(int j = 1;j<=10; j++) { // initialization; condition ; incremental/decremental
			System.out.println(j);
		}
		
		//1
		// 2
		// 3
		// 4
		//....
		//10
		
		
		
		// print 10 to 1
		// k = k - 1 --> k--
		
		for(int k=10;k>=-10;k--) {
			System.out.println(k);
		} 
		
		// Even number 1 to 10 
		
		for(int a = 2; a <=10 ; a= a+2) {
			System.out.println(a);
		}
		
		//2 
		//4
		//6
		
		
		// Automation Session --> need to print 5 times 
		
		int num = 5;
		
		for(int z = 1; z <=num; z++) {
			System.out.println("Automation Session");
		}	
		
		
	}

}

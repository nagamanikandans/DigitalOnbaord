package JavaSessions;

public class IncrementalDecremental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// incremental and decremental operator ++ and --
		
		int i = 1;
		int j = i++; //--> Post Increment i(i = i + 1)
		/*j = i
		i = i+1 */
		
		System.out.println(i); //2
		System.out.println(j); //1
		
		
		int m = 2;
		int n = m--; //--> Post decrement
	/*	n = m
		m = m-1 */
		
		System.out.println(m); //1
		System.out.println(n); //2
		
		int a = 1;
		int b = ++a; //--> Pre Increment (a=a+1)
		/* a = a+1
		  b = a */
		
		System.out.println(a); // 2
		System.out.println(b); // 2
		
		int p = 2;
		int q = --p;  //--> Pre decrement
		/*p = p - 1
		q = p */
		
		System.out.println(p); // 1
		System.out.println(q); // 1
		
	}

}

package ListPackage;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hashing meachnasim to store the values/elements
		// doesn't maintain insertion order
		
		Hashtable h = new Hashtable(); //syntax for creating Hashtable
		
		//add elements in hashTable
		// put --> 
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");		
		System.out.println(h.size()); //3
		
		h.put(1,100);
		h.put(2,200);		
		System.out.println(h.size()); //5
		
		System.out.println(h.get(2));
		System.out.println(h.get("C"));
		
		//Generic
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(1,1000);
		//h1.put("A",2000); ---> Not allowed
		
		Vector v = new Vector();
		v.add(2);
		
		HashSet hs = new HashSet();
		hs.add(200);
		
	}

}

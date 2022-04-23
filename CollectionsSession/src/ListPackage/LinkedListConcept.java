package ListPackage;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Manipulation of data will be faster than arraylist
		// Linkedlist implements LIST interface and DEQUEUE interface. So it can act as a list & queue.
		// It uses Doubly linked list to store elements/values
		
		LinkedList<String> ll = new LinkedList<String>(); // syntax for creating linked list
		
		ll.add("test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RFT");
		ll.add("RPA");
		
		System.out.println("Content of LinkedList" +ll);
		
		//addFirst
		ll.addFirst("Manikandan");		
		System.out.println("Content of LinkedList" +ll);
		
		//addLast
		ll.addLast("Automation");		
		System.out.println("Content of LinkedList" +ll);
		
		//get
		System.out.println(ll.get(2));
		
		//set --> Replace values in list
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		System.out.println("Content of LinkedList" +ll);
		
		//Remove values from linkedList
		
		ll.remove(2);
		System.out.println("Content of LinkedList" +ll);
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Content of LinkedList" +ll);
		
		System.out.println("************************************************");
		
		//for loop
		for(int n = 0; n<ll.size();n++) {
			System.out.println(ll.get(n));
		}
		System.out.println("************************************************");
		
		//advance loop
		for(String str:ll) {		
			System.out.println(str);
		}
		
		System.out.println("************************************************");
		
		//Iterator
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("************************************************");
		//while loop
		
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}

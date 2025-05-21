package Day_8;

import java.util.*;
public class Collectionsp1{
	public static void main(String[] args) {
		ArrayList<Integer> r = new ArrayList<>();
		r.add(10);
		r.add(20);
		r.add(30);
		
		System.out.println(r);//it will print in the form of list soo we are using 
		
		//using for each loop
//		for(int x : r) {
//			System.out.println(x);
//		}
//		System.out.println("All elements are printed!");		
		
		//using Iterator class
//		Iterator i = r.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		System.out.println("All elements are printed!");		
		
		//using ListInteror class
//		ListIterator i = r.listIterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		System.out.println("-----------");
//		while(i.hasPrevious()) {
//		System.out.println(i.previous());
//		}		
//		System.out.println("All elements are printed!");	
		
		Enumeration<Integer> e = Collections.enumeration(r);
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("All elements are printed!");
		
	}
	
}
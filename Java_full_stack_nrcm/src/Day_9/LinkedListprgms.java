package Day_9;

import java.util.*;
public class LinkedListprgms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList<>();
		l.add(10);
		l.add(30);
		l.add(null);
		l.add(10);
		System.out.println(l);
		l.addFirst(1);
		l.add(null);
		l.addLast(100);	
		System.out.println(l);
		l.remove(1);
		l.remove(3);
		l.removeFirst();
		l.removeLast();
		l.removeFirstOccurrence(null);
		l.removeLastOccurrence(30);
		System.out.println(l);
		
		
	}

}

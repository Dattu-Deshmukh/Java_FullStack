package Day_9;
import java.util.*;
public class Stackprgms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(null);
		s.push(10);
		s.push(111);
		
		System.out.println(s);
		//System.out.println(s.toArray());
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			//System.out.println(i.toString());
		}
		
		System.out.println(s);        
		System.out.println(s.pop()); 
		System.out.println(s.peek()); // top element
		System.out.println(s.isEmpty()); // false
		System.out.println(s.search(null)); // 2 (position from top, 1-based)
	}

}

/*
 
   Method	                          Description
push(E item)	         Pushes an item onto the top of the stack
pop()	                 Removes and returns the top item from the stack
peek()	                 Returns (but does not remove) the top item
isEmpty()	             Returns true if the stack is empty
search(Object o)	     Returns 1-based position from the top of the stack, or -1 if not found
size()	                 Returns the number of elements in the stack
clear()	                 Removes all elements from the stack (inherited from Vector)
contains(Object o)	     Checks if the stack contains a specific element
get(int index)	         Returns the element at the specified index (from Vector)
set(int index, E element)	Replaces the element at the specified position
iterator()	             Returns an iterator over the elements
toString()	             Returns a string representation of the stack
 
*/

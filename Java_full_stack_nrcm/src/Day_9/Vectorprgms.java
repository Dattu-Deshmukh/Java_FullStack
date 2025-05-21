package Day_9;

import java.util.*;
public class Vectorprgms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		v.add(12);
		v.add(45);
		v.add(78);
		System.out.println(v);
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
			
	}

}

/*
------------------------------------------------------------------------------------
| Method                              | Description                                |
| ----------------------------------- | ------------------------------------------ |
| `add(E e)`                          | Adds element to the end                    |
| `add(int index, E element)`         | Inserts element at specific position       |
| `get(int index)`                    | Returns element at given index             |
| `set(int index, E element)`         | Replaces element at given index            |
| `remove(int index)`                 | Removes element at index                   |
| `remove(Object o)`                  | Removes the first occurrence of the object |
| `size()`                            | Returns number of elements                 |
| `isEmpty()`                         | Checks if the vector is empty              |
| `clear()`                           | Removes all elements                       |
| `contains(Object o)`                | Returns true if element is in vector       |
| `indexOf(Object o)`                 | Returns index of first occurrence          |
| `lastIndexOf(Object o)`             | Returns index of last occurrence           |
| `toArray()`                         | Converts to array                          |
| `firstElement()`                    | Returns the first element                  |
| `lastElement()`                     | Returns the last element                   |
| `removeElement(Object o)`           | Removes first occurrence of element        |
| `removeAllElements()`               | Removes all elements (like `clear()`)      |
| `elementAt(int index)`              | Returns the element at given index         |
| `insertElementAt(E obj, int index)` | Inserts element at specific index          |
| `setElementAt(E obj, int index)`    | Sets element at specific index             |
| `copyInto(Object[] anArray)`        | Copies elements into given array           |
| `capacity()`                        | Returns the current capacity               |
| `ensureCapacity(int minCapacity)`   | Ensures the vector has specified capacity  |
| `trimToSize()`                      | Trims the capacity to current size         |
| `clone()`                           | Returns a shallow copy                     |
------------------------------------------------------------------------------------
*/

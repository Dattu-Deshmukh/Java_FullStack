package Day_9;
//These all examples are ArrayList 
import java.util.*;


//example 1 allowing duplicates and null values
//public class Collectionsprgm1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<Integer> l = new ArrayList<>();
//		l.add(10);
//		l.add(20);
//		l.add(10);
//		l.add(null);
//		l.add(20);
//		Iterator ll = l.iterator();
//		while(ll.hasNext()) {
//			System.out.println(ll.next());
//		}
//	}
//
//}

//example 2 constructor list 1 to list 2
//public class Collectionsprgm1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<Integer> l = new ArrayList<>();
//		l.add(10);
//		l.add(20);
//		l.add(10);
//		l.add(null);
//		l.add(20);
//		List<Integer> l1 = new ArrayList<>(l);
//		l1.add(90);
//		l1.add(91);
//		l1.add(null);
//		Iterator ll = l1.iterator();
//		while(ll.hasNext()) {
//			System.out.println(ll.next());
//		}
//	}
//
//}

//example 3 using addall method 
//public class Collectionsprgm1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<Integer> l = new ArrayList<>();
//		l.add(10);
//		l.add(20);
//		l.add(10);
//		l.add(null);
//		l.add(20);
//		List<Integer> l1 = new ArrayList<>();
//		l1.add(90);
//		l1.add(91);
//		l1.add(null);
//		l1.addAll(l);
//		Iterator ll = l1.iterator();
//		while(ll.hasNext()) {
//			System.out.println(ll.next());
//		}
//	}
//}

//example 4 using object (parent of all wrapper classes)
//public class Collectionsprgm1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<Object> l = new ArrayList<>();
//		l.add(10);
//		l.add(10.90);
//		l.add("Dattu");
//		l.add(null);
//		l.add(20);
//		List<Object> l1 = new ArrayList<>(l);
//		l1.add(90);
//		l1.add(91.000);
//		l1.add(null);
//		System.out.println(l1);
////		Iterator ll = l1.iterator();
////		while(ll.hasNext()) {
////			System.out.println(ll.next());
////		}
//	}
//
//}

//example 5 user passes the array that is converted into list 
public class Collectionsprgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(10);
		l.add(null);
		l.add(20);
		List<Object> extra = Arrays.asList("ADDING","PADDING");
		l.addAll(1,extra);//1 is index position
		System.out.println(l);
		System.out.println(l.get(5));//access the particular index
		System.out.println(l.indexOf("ADDING"));//WE know the values accessing the index value 
		System.out.println("------");
		
		//direct printing the list 
//		for(Object ll: l) {
//			System.out.println(ll);
//			System.out.println(l.toArray());
//		}
		
		//converting into array
		Object[] arr = l.toArray();
		for(Object t:arr) {
			System.out.println(t);
		}
		
		
	}

}

/*
-------------------------------------------------------------------------------------------------
| Method                                         | Description                                  |
| ---------------------------------------------- | -------------------------------------------- |
| `add(E e)`                                     | Adds element to the end                      |
| `add(int index, E element)`                    | Inserts element at a specific index          |
| `get(int index)`                               | Gets element at index                        |
| `set(int index, E element)`                    | Replaces element at index                    |
| `remove(int index)`                            | Removes element at index                     |
| `remove(Object o)`                             | Removes first occurrence of the object       |
| `contains(Object o)`                           | Checks if the list contains an object        |
| `isEmpty()`                                    | Checks if the list is empty                  |
| `size()`                                       | Number of elements in the list               |
| `clear()`                                      | Removes all elements                         |
| `indexOf(Object o)`                            | Returns index of first occurrence            |
| `lastIndexOf(Object o)`                        | Returns index of last occurrence             |
| `toArray()`                                    | Converts to Object array                     |
| `toArray(T[] a)`                               | Converts to typed array                      |
| `iterator()`                                   | Returns an iterator over the elements        |
| `listIterator()`                               | Returns a list iterator                      |
| `subList(int fromIndex, int toIndex)`          | Returns a portion of the list                |
| `equals(Object o)`                             | Compares with another list                   |
| `retainAll(Collection<?> c)`                   | Retains elements also in another collection  |
| `removeAll(Collection<?> c)`                   | Removes elements found in another collection |
| `containsAll(Collection<?> c)`                 | Checks if all elements are contained         |
| `addAll(Collection<? extends E> c)`            | Adds all elements from another collection    |
| `addAll(int index, Collection<? extends E> c)` | Inserts all elements at specific index       |
| `replaceAll(UnaryOperator<E> operator)`        | Replaces each element using a function       |
| `sort(Comparator<? super E> c)`                | Sorts elements using comparator              |
| `stream()`                                     | Returns a sequential stream                  |
| `parallelStream()`                             | Returns a parallel stream                    |
| `forEach(Consumer<? super E> action)`          | Performs an action on each element           |
-------------------------------------------------------------------------------------------------

*/
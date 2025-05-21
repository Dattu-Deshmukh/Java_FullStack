package Day_9;

import java.util.*;
import java.util.stream.Collectors;
public class ArraysClassPrgms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60};
		Arrays.sort(arr);
		
		
		//using arrays class
//		System.out.println(Arrays.toString(arr));
		
		//using foreach loop 
		for(int b1 : arr)
			System.out.println(b1);
		System.out.println("-------------------------------");
		//reffered from chatgpt
		System.out.println(Arrays.stream(arr).min().getAsInt());//syntax for min value
		System.out.println(Arrays.stream(arr).max().getAsInt());//for max value
		Arrays.stream(arr).filter(n -> n % 2 == 0).forEach(System.out::println);//even numbers 
		Arrays.stream(arr).map(n -> n * n).forEach(System.out::println);//square numbers 
		Arrays.stream(arr).filter(n -> n % 2 == 0).map(n -> n * n).forEach(System.out::println);//square only even numbers 
		double avg = Arrays.stream(arr).average().getAsDouble();//average of all values
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int sum = Arrays.stream(arr).sum();//sum of all numbers 
		System.out.println(sum);
		



	}

}


/*
-------------------------------------------------------------------------------------------
| Method                          | Description                                           |
| ------------------------------- | ----------------------------------------------------- |
| `add(E e)`                      | Adds an element at the end                            |
| `add(int index, E element)`     | Inserts element at specific index                     |
| `get(int index)`                | Returns element at the given index                    |
| `set(int index, E element)`     | Replaces element at index                             |
| `remove(int index)`             | Removes element at index                              |
| `remove(Object o)`              | Removes first occurrence of the object                |
| `size()`                        | Returns number of elements                            |
| `isEmpty()`                     | Checks if list is empty                               |
| `contains(Object o)`            | Returns `true` if list contains the object            |
| `indexOf(Object o)`             | Returns index of first occurrence                     |
| `lastIndexOf(Object o)`         | Returns index of last occurrence                      |
| `clear()`                       | Removes all elements                                  |
| `toArray()`                     | Converts `ArrayList` to array                         |
| `sort(Comparator<? super E> c)` | Sorts elements using a comparator                     |
| `iterator()`                    | Returns an iterator for the list                      |
| `subList(int from, int to)`     | Returns a portion of the list                         |
| `equals(Object o)`              | Compares with another list                            |
| `clone()`                       | Creates a shallow copy                                |
| `retainAll(Collection<?> c)`    | Keeps only the elements present in another collection |
| `removeAll(Collection<?> c)`    | Removes all elements present in another collection    |
-------------------------------------------------------------------------------------------

*/

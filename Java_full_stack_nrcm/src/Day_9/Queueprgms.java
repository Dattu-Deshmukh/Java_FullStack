package Day_9;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queueprgms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new PriorityQueue<>();
		q.add(12);
		q.offer(24);
		q.offer(450);
		q.offer(45);
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.remove();
		System.out.println(q);
	}
}
/*
---------------------------------------------------------------------------------------
| Method               | Description                                                  |
| -------------------- | ------------------------------------------------------------ |
| `add(E e)`           | Inserts the element, throws exception if capacity is full    |
| `offer(E e)`         | Inserts the element, returns `false` if capacity is full     |
| `remove()`           | Removes and returns the head, throws exception if empty      |
| `poll()`             | Removes and returns the head, returns `null` if empty        |
| `element()`          | Returns the head without removing, throws exception if empty |
| `peek()`             | Returns the head without removing, returns `null` if empty   |
| `size()`             | Number of elements                                           |
| `isEmpty()`          | Checks if the queue is empty                                 |
| `clear()`            | Removes all elements                                         |
| `contains(Object o)` | Checks if the element is present                             |
| `toArray()`          | Converts to an array                                         |
| `iterator()`         | Returns an iterator                                          |
---------------------------------------------------------------------------------------
	
	*/
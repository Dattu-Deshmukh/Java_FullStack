package Day_9;

import java.util.*;

//Hash map example
//public class Mapsprgms {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Map<Integer,String> d = new HashMap<>();
//		d.put(1,"CSE_A");
//		d.put(2, "CSE_B");
//		d.put(4, "CSE_D");
//		d.put(6, "ECE_B");
//		d.put(3, "CSE_C");
//		d.put(5, "ECE_A");
//		d.put(null, null);
//		System.out.println(d);
//		for(Map.Entry<Integer,String> val : d.entrySet() ) {
//			System.out.println("Key value is "+val.getKey() + "=Value is "+val.getValue());
//			//System.out.println(val.getClass());
//			
//		}
//		
//		
//
//	}
//
//}


//LinkedHashMap Example
//public class Mapsprgms {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Map<Integer,String> d = new LinkedHashMap<>();
//		d.put(1,"CSE_A");
//		d.put(2, "CSE_B");
//		d.put(4, "CSE_D");
//		d.put(6, "ECE_B");
//		d.put(3, "CSE_C");
//		d.put(5, "ECE_A");
//		System.out.println(d);
//		for(Map.Entry<Integer,String> val : d.entrySet() ) {
//			System.out.println("Key value is "+val.getKey() + "=Value is "+val.getValue());
//			//System.out.println(val.getClass());
//			
//		}
//	}
//
//}


//Treemap
public class Mapsprgms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> d = new TreeMap<>();
		d.put(1,"CSE_A");
		d.put(2, "CSE_B");
		d.put(4, "CSE_D");
		d.put(6, "ECE_B");
		d.put(3, "CSE_C");
		d.put(5, "ECE_A");
		System.out.println(d);
		for(Map.Entry<Integer,String> val : d.entrySet() ) {
			System.out.println("Key value is "+val.getKey() + "=Value is "+val.getValue());
			//System.out.println(val.getClass());
			
		}
		
		

	}

}
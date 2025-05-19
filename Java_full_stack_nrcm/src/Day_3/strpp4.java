package Day_3;

public class strpp4 {

	public static void main(String[] args) {
		// using string builder 
		String s1 = "Dattu";
		String s2 = "Deshmukh";
		//i want to append the s2 into s1 string cannot append it is immutable 
		//thats why string builder is using 
		StringBuilder s = new StringBuilder(s1);
		StringBuilder ss = new StringBuilder(s2);
		s.append(" "+s2 + " " + s2);
		System.out.println(s);
		
		System.out.println(s.getClass());
		System.out.println(s1.getClass());
		

	}

}

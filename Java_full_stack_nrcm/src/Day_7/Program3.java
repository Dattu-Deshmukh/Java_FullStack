package Day_7;
import java.util.*;

//exceptions
//using throws keyword 
//public class Program3 {
//
//	public static void main(String[] args) throws ArithmeticException ,InputMismatchException {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the values of a and b: ");
//		int a = in.nextInt();
//		int b = in.nextInt();
//		int c = a/b;
//		System.out.println(c);
//	}
//
//}


////using methods ex1
//public class Program3 {
//	static void add(int a, int b) throws ArithmeticException ,InputMismatchException{
//		
//		int c = a/b;
//		System.out.println(c);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		Program3 s1 = new Program3();
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the values of a and b: ");
//		int a = in.nextInt();
//		int b = in.nextInt();
//		try {
//		add(a,b);
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
//	}
//}

//using methods ex1
//public class Program3 {
//	static void add(int a, int b) throws ArithmeticException{
//		if(b==0) {
//			throw new ArithmeticException("Niku sarigga numbes evvadam kuda radhu ! ");
//		}
//		int c = a/b;
//		System.out.println(c);
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		Program3 s1 = new Program3();
////		Scanner in = new Scanner(System.in);
////		System.out.println("Enter the values of a and b: ");
////		int a = in.nextInt();
////		int b = in.nextInt();
//		try {
//		add(10,0);
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("Covered all keywords! ");
//		}
//	}
//}
//user Defined Exceptions


class Cheppanu extends Exception{
	public Cheppanu(String message) {
		super(message);
	}
}
public class Program3{
	public static void ageCheck(int age) throws Cheppanu{
		if(age > 18) {
			throw new Cheppanu("Nenu cheppanu!");
		}
		else {
			System.out.println("Na age 18 below");
		}
	}
	public static void main(String[] args) {
		try {
			ageCheck(20);
		}catch (Cheppanu e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Happy coding anta !");
		}
	}
}
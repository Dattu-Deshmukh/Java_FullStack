package Day_7;

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		try {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = a/b;
		}
//		catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
//		catch(InputMismatchException e) {
//			System.out.println("YOu Entered in valid number ");
//		}
		catch(ArithmeticException|InputMismatchException e ) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally completed ! 10 ");
		}
		
	}
}

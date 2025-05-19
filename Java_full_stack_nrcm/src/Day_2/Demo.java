package Day_2;
//import java.util.*;


public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1100;
//		System.out.println("Enter any value to check the number ");
//		Scanner in = new Scanner(System.in);
//		int b = in.nextInt();
//		System.out.println("b value "+b);
		if(a%2==0) {
			System.out.println("Satisfied ! ");
			if(a%3==0)
				System.out.println("multiplied with "+ a +" also");
			else
				System.out.println("Not Multiplied ");
		}
		else
			System.out.println("Not satisfied");
		System.out.println();
	}
}

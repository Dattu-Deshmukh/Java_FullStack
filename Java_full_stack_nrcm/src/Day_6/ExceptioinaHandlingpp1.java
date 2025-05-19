
//without try catch block -- using command line argument 
//package Day_6;
//
//public class ExceptioinaHandlingpp1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a = Integer.parseInt(args[0]);
//		int b = Integer.parseInt(args[1]);
//		System.out.println("Hello ");
//		int c = a/b;
//		System.out.println(c);
//		System.out.println("Hello1");
//	}
//
//}


//with try catch block ex p1
//package Day_6;
//
//public class ExceptioinaHandlingpp1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a = Integer.parseInt(args[0]);
//		int b = Integer.parseInt(args[1]);
//		System.out.println("Hello ");
//		try {
//		int c = a/b;
//		System.out.println(c);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		System.out.println("Hello1");
//	}
//
//}


//try catch block ex p2
package Day_6;

public class ExceptioinaHandlingpp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Hello ");
		try {
		int c = a/b;
		System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage()+"\n");
			e.printStackTrace();
			System.out.println(e.toString()+"\n");
		}
		System.out.println("Hello1");
	}

}
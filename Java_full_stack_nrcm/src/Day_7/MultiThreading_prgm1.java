package Day_7;

//public class MultiThreading_prgm1 extends Thread {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		MultiThreading_prgm1 d1 = new  MultiThreading_prgm1();
//		MultiThreading_prgm1 d2 = new MultiThreading_prgm1();
//		MultiThreading_prgm1 d3 = new MultiThreading_prgm1();
//		
//		System.out.println(d1.getName());
//		System.out.println(d2.getName());
//		System.out.println(d3.getName());
//		System.out.println(d1.getState());
//	}
//
//}

//MultiThreading  stages initial examples : 
public class MultiThreading_prgm1 extends Thread {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		MultiThreading_prgm1 d1 = new  MultiThreading_prgm1();
		Thread t1 = new Thread(d1);
		t1.start();
		System.out.println("Nenu mrugram! ");
		System.out.println(d1.getState());
		Thread.sleep(1000);
		System.out.println("Nenu maranam !");
		
	}

}

package Day_8;

//multithreading using thread class
//public class MulltiThreading1 extends Thread {
//	public void run() {
//		System.out.println("HIi");
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		MulltiThreading1 t1 = new MulltiThreading1();
//		System.out.println("Hello");
//		t1.start();
//	}
//
//}

//multithreading using runnable interface
//public class MulltiThreading1 implements Runnable{
//	public void run() {
//		System.out.println("HI");
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		MulltiThreading1 t1 = new MulltiThreading1();
//		Thread t2 = new Thread(t1);
//		Thread t3 = new Thread(t1);
//		System.out.println("Hello");
//		t2.start();
//		t3.start();
//		System.out.println(t2.getName());
//		System.out.println(t3.getName());
//	}
//
//}


//example1
//class Test1 extends Thread{
//	public void run() {
//		System.out.println("Test1 run method!");
//	}
//}
//class Test2 extends Thread{
//	public void run() {
//		System.out.println("Test2 run method!");
//	}
//}
//public class MulltiThreading1{
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Test1 t1 = new Test1();
//		Test2 t2 = new Test2();
////		Thread t3 = new Thread(t1);
////		Thread t4 = new Thread(t2);
//		t1.start();
//		t2.start();
////		System.out.println(t2.getName());
////		System.out.println(t3.getName());
//	}
//
//}

//example2
//class Test1 extends Thread{
//	public void run() {
//		System.out.println("Test1 run method!");
//		System.out.println(Thread.currentThread().getName());
//	}
//}
//class Test2 extends Test1{
//	public void run() {
//		System.out.println("Test2 run method!");
//		System.out.println(Thread.currentThread().getName());
//	}
//}
//class Test3 implements Runnable{
//	public void run() {
//		System.out.println("Test3 run method!");
//		System.out.println(Thread.currentThread().getName());
//	}
//}
//class Test4 extends Test3{
//	public void run() {
//		System.out.println("Test4 run method!");
//		System.out.println(Thread.currentThread().getName());
//	}
//}
//public class MulltiThreading1{
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(Thread.currentThread().getName());
//			Test1 t1 = new Test1();
//	        t1.start();
//
//	        Test2 t2 = new Test2();
//	        t2.start();
//
//	        // Using Runnable implementation
//	        Test3 t3 = new Test3();
//	        Thread t4 = new Thread(t3);
//	        t4.start();
//
//	        Test4 t5 = new Test4();
//	        Thread t6 = new Thread(t5);
//	        t6.start();
////		System.out.println(t2.getName());
////		System.out.println(t1.getName());
//		
//	}
//
//

//example 4 :
//class Test1 extends Thread{
//	public void run() {
//		System.out.println("Test1 run method!");
//		System.out.println(Thread.currentThread().getName());
//	}
//}
//class Test2 extends Test1{
//	public void run() {
//		System.out.println("Test2 run method!");
//		System.out.println(Thread.currentThread().getName());
//	}
//}
//class Test3 implements Runnable{
//	public void run() {
//		System.out.println("Test3 run method!");
//		System.out.println(Thread.currentThread().getName());
//	}
//}
//class Test4 extends Test3{
//	public void run() {
//		System.out.println("Test4 run method!");
//		System.out.println(Thread.currentThread().getName());
//	}
//}
//public class MulltiThreading1{
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(Thread.currentThread().getName());
//		//using Thread class
//		Test1 t1 = new Test1();
//        t1.start();
//        
//        try {
//	        t1.join();
//	        Thread.sleep(40);
//		}
//        catch(Exception e) {
//        	System.out.println(e);
//        }
//        Test2 t2 = new Test2();
//        t2.start();
//
//        // Using Runnable implementation
//        Test3 t3 = new Test3();
//        Thread t4 = new Thread(t3);
//        t4.start();
//
//        Test4 t5 = new Test4();
//        Thread t6 = new Thread(t5);
//        t6.start();
//		try {
//			
//	        t1.join();
//	        Thread.sleep(40);
//		}
////	        t2.join();
////	        Thread.sleep(40);
////	        t4.join();
////	        Thread.sleep(40);
////	        t6.join();
////	        Thread.sleep(40);
//		
//		catch(Exception e) {
//			System.out.println(e);
//		}
//	        
////		System.out.println(t2.getName());
////		System.out.println(t1.getName());
//		
//	}
//
//}


//example 5 
//Unanimous object 
//class MulltiThreading1{
//	public static void main(String[] args) {
//		Runnable r1 = new Runnable() {
//			public void run() {
//				System.out.println("Test one ");
//			}
//		};
//		Runnable r2 = new Runnable() {
//			public void run() {
//				System.out.println("Test Two ");
//			}
//		};
//		Thread t1 = new Thread(r1);
//		Thread t2 = new Thread(r2);
//		t1.start();
//		t2.start();
//	}
//}

//example 6
//public class MulltiThreading1 extends Thread{
//	public void run() {
//		for(int i = 1;i<=10;i++) {
//			System.out.println(i);
//			System.out.println("Thread in "+Thread.currentThread().getStackTrace());
//			System.out.println("Thread in "+Thread.currentThread().getName());
//			
//			if(i == 5) {
//				try {
//					Thread.sleep(5000);
//				}catch(InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//	}
//	public static void main(String[] args) {
//		MulltiThreading1 tt = new MulltiThreading1();
//		tt.start();
//	}
//}

public class MulltiThreading1 extends Thread{
	String s;
	public MulltiThreading1(String name) {
		s = name;
	}
	public void run() {
		//Checking whether the thread is Daemon or not 
		if(Thread.currentThread().isDaemon()) {
			System.out.println(s+"is Daemon Thread");
		}
		else {
			System.out.println(s+" is Daemon Thread");
		}
	}
	public static void main(String[] args) {
		MulltiThreading1 t1 = new MulltiThreading1("Thread1");
		MulltiThreading1 t2 = new MulltiThreading1("Thread2");
		MulltiThreading1 t3 = new MulltiThreading1("Thread3");
		
		t1.setDaemon(true);//set user t1 to Daemon
		
		
		t1.start();//starting Thread1
		t2.start();//starting Thread1
		
		t3.setDaemon(false);//set user Thread1 to Daemon
		t3.start();// starting Thread3
		
	}
}


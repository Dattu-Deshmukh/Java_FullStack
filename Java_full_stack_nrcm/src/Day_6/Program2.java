package Day_6;

//Nested Class
//public class Program2 {
//	void show() {
//		System.out.println("Hii");
//	}
//	class Test23{
//		void print() {
//			System.out.println("Hello!");
//		}
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Program2 p = new Program2();
//		p.show();
//		Program2.Test23 t = new Program2().new Test23();
//		t.print();
//		
//	}
//
//}

//method local inner class 


//method for static class 
class sample{
	static void show() {
		System.out.println("Hello");
	}
	static class Test{
		static void print() {
			System.out.println("Hiiiii");
			show();
		}
	}
}
public class Program2{
	public static void main(String[] args) {
		sample.Test.print();
	}
}

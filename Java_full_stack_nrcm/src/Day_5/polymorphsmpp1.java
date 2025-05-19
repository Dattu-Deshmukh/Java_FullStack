package Day_5;
//compile time polymorphisum 
//class pp1{
//	//main method overloaded
//	public void main() {
//		System.out.println("Main overloaded! ");
//	}
//	void show() {
//		System.out.println("First Message! ");
//	}
//	void show(int a,int b) {
//		System.out.println("Addition : "+(a+b));
//	}
//	void show(double a,double b) {
//		System.out.println("Subtraction : "+(a-b));
//	}
//	void show(String s1, String s2) {
//		System.out.println("COncatination : "+s1+s2);
//	}
//}
//public class polymorphsmpp1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		pp1 in = new pp1();
//		in.show();
//		in.show(10, 20);
//		in.show(28.4, 234.09);
//		in.show("Dattu-", "Deshmukh");
//		in.main();
//
//	}
//
//}



//runtime polymorphism 

class pp1{
	void add() {
		System.out.println("Hii");
	}
}
class pp2 extends pp1{
	void add() {
		//super.add();
		System.out.println("Hello");
	}
}

public class polymorphsmpp1 {

	public static void main(String[] args) {
		pp1 i = new pp2();
		i.add();
	}

}


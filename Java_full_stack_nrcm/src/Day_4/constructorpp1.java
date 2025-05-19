package Day_4;
//constructor :::
//class demo11{
//	public demo11() {
//		System.out.println("Hello mawa");
//	}
//}
//
//public class constructorpp1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		demo11 d = new demo11();
//	}
//
//}


//parameterized constructor 

//class demo11{
//	int a=67;
//	int b;
//	public demo11(int a,int c) {
//		System.out.println("in side this class is value of a is "+a);
//		this.a = a;
//		System.out.println("passed value is : "+a);
//		System.out.println("in side this class is after this value of a is "+a);
//		b = c;
//		System.out.println("passed 2 value is : "+b);
//	}
//}
//
//public class constructorpp1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		demo11 d = new demo11(90, 99);
//	}
//}

//copy constructor 
//class demo11{
//	int x;
//	int y;
//	
//	public demo11(int x, int y) {
//		this.x=x;
//		this.y=y;
//		System.out.println("Addtion of x and y: "+(x+y));
//	}
//	
//	public demo11(demo11 d) {
//		this.x=d.x;
//		this.y=d.y;
//		System.out.println("Subtraction of x and y: "+(x-y));
//	}
//}
//
//public class constructorpp1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		demo11 d = new demo11(10,5);
//		demo11 d1 = new demo11(d);
//	}
//
//}

//constructor overloading 
class demo11{
	float x,z;
	int y;
	public demo11() {
		System.out.println("Well Come to my profiile : ");
		System.out.println();
	}
	public demo11(float x) {
		this.x=x;
		System.out.println("My SSC CGPA is : "+this.x);
		System.out.println();
	}
	public demo11(float x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("My SSC CGPA is : "+this.x+"\nMy Inter Marks are : "+this.y);
		System.out.println();
	}
	public demo11(float x, int y, float z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println("My SSC CGPA is : "+this.x+"\nMy Inter Marks are : "+this.y+"\nMy B Tech CGPA is : "+this.z);
	}
}

public class constructorpp1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo11 d = new demo11();
		demo11 d1 = new demo11(9.5f);
		demo11 d2 = new demo11(9.5f,900);
		demo11 d3 = new demo11(9.5f, 900, 8.0f);	
	}

}

//this keyword example 
//class demo11{
//	int a = 89;
//	
//	public void add() {
//		System.out.println("add");
//	}
//	
//	public void sub() {
//		this.add();
//		System.out.println(this.a);
//	}
//}
//
//public class constructorpp1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		demo11 d = new demo11();
//		d.sub();
//	}
//
//}

//this keyword example prgm1 
//class demo11{
//	int a;
//	int b;
//	public demo11(int x,int y) {
//		a=x;
//		b=y;
//		System.out.println("Addition of two numbers with x and y:"+(x+y));
//	}
//	public void add() {
//		System.out.println("Addition of two numbers with a and b:"+(this.a+this.b));
//	}
//
//}
//
//public class constructorpp1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		demo11 d = new demo11(89,98);
//		d.add();
//	}
//
//}

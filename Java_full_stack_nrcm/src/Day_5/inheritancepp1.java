package Day_5;

//Single Inheritance
//class Animal{
//	void sleep() {
//		System.out.println("IN sleep Mode");
//	}
//}
//class Dog extends Animal{
//	void bark() {
//		System.out.println("Dog is Barking");
//	}
//}
//public class inheritancepp1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Dog in = new Dog();
//		in.bark();
//		in.sleep();
//	}
//}


//multi level inheritance
//class Bike {
//	 void Speed() {
//		// TODO Auto-generated method stub
//		 System.out.println("250 ");
//	}
//}
//class Bmw extends Bike{
//	void rev() {
//		System.out.println("1000cc");
//	}
//}
//class Model extends Bmw{
//	void price() {
//		System.out.println("30lac");
//	}
//}
//public class inheritancepp1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Model in = new Model();
//		in.Speed();
//		in.rev();
//		in.price();
//	}
//}


//multi path inheritance
//class fruits {
//	 void benifits() {
//		 System.out.println("Healthy  ");
//	}
//}
//class apple extends fruits{
//	void color() {
//		System.out.println("red");
//	}
//}
//class mango extends fruits{
//	void price() {
//		System.out.println("1000");
//	}
//}
//class banana extends fruits{
//	void taste() {
//		System.out.println("sweet");
//	}
//}
//public class inheritancepp1 {
//
//	public static void main(String[] args) {
//		apple a = new apple();
//		mango m = new mango();
//		banana b = new banana();
//		a.benifits();
//		a.color();
//		m.benifits();
//		m.price();
//		b.benifits();
//		b.taste();
//	}
//}

//multi path inheritance
//class movie {
//	 void genre() {
//		 System.out.println("Crime and Thriller---- ");
//	}
//}
//class hit extends movie{
//	void title() {
//		System.out.println("hit-3");
//	}
//}
//class herooo extends hit{
//	void name() {
//		System.out.println("nani");
//	}
//}
//class herion extends hit{
//	void name() {
//		System.out.println("srenidhi ");
//	}
//}
//public class inheritancepp1 {
//
//	public static void main(String[] args) {
//		herooo h = new herooo();
//		herion h1 = new herion();
//		h.genre();
//		h.title();
//		h.name();
//		h1.genre();
//		h1.title();
//		h1.name();
//	}
//}

//multiple inheritance 
interface I1{
	void add();
}
class prgm2{
	void sub() {
		System.out.println("hello ra banti ");
	}
}
class prgm1 extends prgm2 implements I1{
	public void add() {
		System.out.println("hii");
	}
}

public class inheritancepp1 {
	public static void main(String[] args) {
		prgm1 i = new prgm1();
		i.add();
		i.sub();
	}
}
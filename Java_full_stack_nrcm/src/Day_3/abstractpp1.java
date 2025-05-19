package Day_3;

//abstract class arth{
//	abstract void add();
//	abstract void sub();
//	void mul() {
//		System.out.println("3. mul method \n mulluuu");
//	}
//	static void div() {
//		System.out.println("4.div method \n divvvvvuuuuuuu");
//	}
//}
//
//class na extends arth{
//	public void add() {
//		System.out.println("1.add method\n hii ra ");
//	}
//	public void sub() {
//		System.out.println("2.sub method \n hello ra sub ");
//	}
//}
//
//public class abstractpp1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		na a = new na();
//		a.add();
//		a.sub();
//		a.mul();
//		arth.div();
//	}
//}

abstract class arth{
	private int x;
	private int y;
	public void it(int x,int y) {
		x= this.x;
		y = this.y;
	}
	abstract void add();
	abstract void sub();
	void mul() {
		System.out.println("Addition of two numbers"+(x*y));
		System.out.println("3. mul method \n mulluuu"+(x/y));
	}
	static void div() {
		System.out.println("Addition of two numbers"+(x/y));
		System.out.println("4.div method \n divvvvvuuuuuuu");
	}
}

class na extends arth{
	int x,y;
	int x,y;
	na(int x, int y){
		x = this.x;
		y = this.y;
	}
	public void add() {
		System.out.println("Addition of two numbers"+(x+y));
		System.out.println("1.add method\n hii ra ");
	}
	public void sub() {
		System.out.println("Addition of two numbers"+(x-y));
		System.out.println("2.sub method \n hello ra sub ");
	}
}

public class abstractpp1 {

	public static void main(String[] args, Object b) {
		// TODO Auto-generated method stub
		na a = new na(12, 120);
		int x = 10;
		int y = 20;
		a.add();
		a.sub();
		a.mul();
		arth.div();
	}
}






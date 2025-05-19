package Day_3;

abstract class arthh{
	abstract void add();
	void mul() {
		System.out.println("3. mul method \n mulluuu");
	}
	void mul1() {
	System.out.println("3.1 nul out 2 ");
	}
	static void div() {
		System.out.println("4.div method \n divvvvvuuuuuuu");
	}
	static void div1() {
		System.out.println("Div out class 2 ");
	}
}

class naa extends arthh{
	public naa() {
		// TODO Auto-generated constructor stub
	}
	public void add() {
		System.out.println("1.add method\n hii ra ");
	}
	void neeraj() {
		System.out.println("Toppper of ece");
	}
	public void mul1() {
		// TODO Auto-generated method stub
		
	}
}

public class abstractpp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		naa a = new naa();
		a.add();
		a.mul();
		a.mul1();
		arth.div();
		a.neeraj();
	}
}



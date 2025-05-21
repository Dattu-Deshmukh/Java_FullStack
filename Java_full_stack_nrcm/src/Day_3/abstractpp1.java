package Day_3;

abstract class arth{
	abstract void add();
	abstract void sub();
	void mul() {
		System.out.println("3. mul method \n mulluuu");
	}
	static void div() {
		System.out.println("4.div method \n divvvvvuuuuuuu");
	}
}

class na extends arth{
	public void add() {
		System.out.println("1.add method\n hii ra ");
	}
	public void sub() {
		System.out.println("2.sub method \n hello ra sub ");
	}
}

public class abstractpp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		na a = new na();
		a.add();
		a.sub();
		a.mul();
		arth.div();
	}
}







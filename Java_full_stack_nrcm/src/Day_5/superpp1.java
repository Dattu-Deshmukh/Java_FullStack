package Day_5;

class Sample{
	public Sample() {
		System.out.println("Good Evening!");
	}
	int x = 99;
	void print() {
		System.out.println("Hello!");
	}
}
class Test extends Sample{
	public Test() {
		super();
	}
	void show() {
		int y = 45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
		
	}
}

public class superpp1 {

	public static void main(String[] args) {
		Test t = new Test();
		t.show();
	}

}

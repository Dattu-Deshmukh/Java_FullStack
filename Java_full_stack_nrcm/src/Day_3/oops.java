package Day_3;

abstract class name{
	abstract void add();	
}
class name1 extends name{
	public void add() {
		System.out.println("hii ra ");
	}
}

public class oops {
//	public void add() {
//		System.out.println("hii ra ");
//	}
	public static void main(String[] args) {
		//Abstraction 
		name1 a = new name1();
		a.add();
	}
}

package Day_6;
//this keyword
//class This{
//	int a = 90;
//	void add() {
//		sub();
//	}
//	void sub() {
//		//int a =900;
//		//System.out.println(a);
//		System.out.println(this.a);
//	}
//}
//public class KeywordsProgram1 {
//
//	public static void main(String[] args) {
//		This t = new This();
//		t.add();
//	}
//
//}


//final Keyword
class Final{
	void show() {
		int a = 90;
		System.out.println(a);
		a =909;
		System.out.println(a);
	}
}
public class KeywordsProgram1 {

	public static void main(String[] args) {
		Final t = new Final();
		//t.add();
		t.show();
	}

}
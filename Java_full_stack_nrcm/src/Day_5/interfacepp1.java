package Day_5;

interface II{
	void add();
	void sub();
}
class ppp1 implements II{
	public void add() {
		System.out.println("1st method add--");
	}
	public void sub() {
		System.out.println("2n method sub---");
	}
}

public class interfacepp1 {

	public static void main(String[] args) {
		ppp1 p = new ppp1();
		p.add();
		p.sub();
	}

}

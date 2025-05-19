package Day_4;

class fixedamount{
	public static int fixedamount_ = 10000;
}

abstract class WithdrawalAmount{
	abstract void withdraw(int amount);
}

public class pp1 extends fixedamount{
	public static void withdraw(int cash) {
		fixedamount_ -=cash;
		System.out.println("Withdrawn amount : "+cash);
		System.out.println("Available balence "+fixedamount_);
	}

	public static void main(String[] args) {
		int amt2 = Integer.parseInt(args[0]);
		withdraw(amt2);
		
	}

	//public class pp1 extends fixedamount{
//	fixedamount f1 = new fixedamount();
//	void withdraw(int cash) {
//		f1.fixedamount_ -=cash;
//		System.out.println("withdrawn : "+cash);
//		System.out.println("Available Balence : "+f1.fixedamount_);
//		
//	}
//	public static void main(String[] args) {
//		int amount = Integer.parseInt(args[0]);
//		pp1 d = new pp1();
//		d.withdraw(amount);
//	
//	}
	
}

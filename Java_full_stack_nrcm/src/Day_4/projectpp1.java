package Day_4;

//Basic program 
//class demo1{
//	private String firstname ;
//	private String lastname ;
//	private String email;
//	private long phoneNo;
//	
//	public void setFirstName(String fn) {
//		firstname = fn;
//	}
//	
//	public void setLastName(String ln) {
//		lastname = ln;
//	}
//	
//	public void setEmail(String em) {
//		email = em;
//	}
//	
//	public void setPhoneNo(long pn) {
//		phoneNo = pn;
//	}
//	
//	public String getFirstName() {
//		return "First Name: "+firstname;
//	}
//	
//	public String getLastName() {
//		return "Last Name: "+lastname;
//	} 
//	
//	public String getEmail() {
//		return "Email: "+email;
//	}
//	
//	public long getPhoneNo() {
//		return phoneNo;
//	}
//}
//
//
//public class projectpp1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		demo1 d = new demo1();
//		d.setFirstName("Dattu");
//		d.setLastName("Deshmukh");
//		d.setEmail("dattudehsmukh021@gmail.com");
//		d.setPhoneNo(9113551448l);
//		System.out.println(d.getFirstName());
//		System.out.println(d.getLastName());
//		System.out.println(d.getEmail());
//		System.out.println("Phone N0: "+d.getPhoneNo());
//		
//	}
//
//}





// real time working
import java.util.*;
class demo1{
	private String firstname ;
	private String lastname ;
	private String email;
	private String phoneNo;
	
	public void setFirstName(String fn) {
		firstname = fn;
	}
	
	public void setLastName(String ln) {
		lastname = ln;
	}
	
	public void setEmail(String em) {
		email = em;
	}
	
	public void setPhoneNo(String pn) {
		phoneNo = pn;
	}
	
	public String getFirstName() {
		return "First Name: "+firstname;
	}
	
	public String getLastName() {
		return "Last Name: "+lastname;
	} 
	
	public String getEmail() {
		return "Email: "+email;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
}


public class projectpp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		demo1 d = new demo1();
		System.out.print("Enter your First Name : ");
		String s1 = in.next();
		d.setFirstName(s1);
		
		System.out.print("Enter your Last Name : ");
		String s2 = in.next();
		d.setLastName(s2);
		
		System.out.print("Enter Email Address: ");
		String s3 = in.next();
		// Basic email validation using regex
		if (s3.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
			d.setEmail(s3);
		} else {
			System.out.println("Invalid email address.");
		}
		
		System.out.print("Enter Phone No: ");
		long pn = in.nextLong();
		String phoneStr = Long.toString(pn);
		// Assuming Indian phone number: 10 digits and starts with 6-9
		if (phoneStr.matches("^[6-9]\\d{9}$")) {
			d.setPhoneNo(phoneStr);
		} else {
			System.out.println("Invalid phone number.");
		}
		
		System.out.println(d.getFirstName());
		System.out.println(d.getLastName());
		if(d.getEmail() == null) {
			System.out.println("You Entered invalid email!.");
		}
		else {
		System.out.println(d.getEmail());
		}
		if(d.getPhoneNo() == null) {
			System.out.println("Phone no : You entered invalid phone no !..");
		}
		else {
		System.out.println("Phone N0: "+d.getPhoneNo());
		}
	}

}

package Day_2;

public class patterns {

	public static void main(String[] args) {
		//pattern 
		/*12345
		 * 12345
		 * 12345
		 * 12345
		 * 12345
		 */
		
		//for loop 
		for(int i = 1;i<=5;i++)
		{
			for(int j = 1 ;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		//while loop 
		int n = 1;
		int i = 1;
		while(n<6) {
			int m = 1;
			while(m<6) {
				System.out.print(m);
				m++;
			}
			System.out.println();
			n++;
		}
		
		//switch case 
		String color="orange";
		switch(color)
		{
		case "red":
			System.out.println("Celebration of holi");
			break;
		case "green":
			System.out.println("Celebration of ramzan1");
			break;
		case "orange":
			System.out.println("Celebration of neeraj story");
			break;
		default:System.out.println("byee");
		break;
		}
	}

}

package Day_3;

public class strpp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Helloworldd";
		int c = 0;
		for(int i = 0;i<s.length();i++)
		{
			if((s.charAt(i))=='l')
			{
				c++;
			}
		}
		System.out.println(c);

	}

}

package Day_3;

public class strprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Helloworld";
		String v = "";
		String c = "";
		//char[] ch = {'a','e','i','o','u','A','E','I','O','U'};
		String ch = "aeiouAEIOU";
		for(int i = 0;i<s.length();i++)
		{
			char cc = s.charAt(i);
			if(ch.contains(cc+""))
			{
				//v = v+cc;
				v=v.concat(Character.toString(cc));
			}
			else
				
			{
				//c = c+cc;
				c=c.concat(Character.toString(cc));
			}
		}
		System.out.println(v);
		System.out.println(c);
	}

}

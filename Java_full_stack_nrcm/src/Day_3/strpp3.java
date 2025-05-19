package Day_3;

public class strpp3 {

	public static void main(String[] args) {
		// method-1
//		String s1 = "listen";
//		String s2 = "silent";
//		boolean b = true;
//		if(s1.length()==s2.length()) {
//			for(int i = 0;i<s1.length();i++)
//			{
//				if(s1.contains(s1.charAt(i)+""))
//				{
//					b = true;
//				}
//			}
//		}
//		if(b==true)
//		{
//			System.out.println("Anagram ra babu");
//		}
//		else
//			System.out.println("Kadhu ra babu");
		
		//method-2
		String s1 = "listen";
		String s2 = "silent";
		int[] count =  new int[26];
		
		for(int i = 0;i<s1.length();i++)
		{
			count[s1.charAt(i) - 'a']++;
			count[s2.charAt(i) - 'a']--;
		}
		
		boolean isAnagram = true;
		
		for(int i = 0;i<26;i++) {
			if(count[i]!=0) {
				isAnagram = false;
				break;
			}
		}
		
		if(isAnagram) {
			System.out.println("Anagram");
		}
		else
			System.out.println("Not");
	}

}

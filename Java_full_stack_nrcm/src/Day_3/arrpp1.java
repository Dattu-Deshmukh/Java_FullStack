package Day_3;

public class arrpp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] a = {1,1,2,3,4,55,55,65,89};
//		int [] aa = new int[a.length];
//		int count = 0;
//		int size = 0;
//		for(int i = 0;i<a.length;i++)
//		{
//			count = 0;
//			for(int j = 0;j<a.length;j++) {
//				if(a[i]==a[j])
//					count++;
//			}
//			if(count == 1) {
//			aa[size++]=a[i];
//			}
//		}
//		System.out.println("no repeated ");
//		for(int i = 0;i<size;i++)
//		{
//			System.out.println(aa[i]);
//		}
		
		//method-2
		int [] a = {1,1,2,3,4,55,55,65,89};
		int count = 0;
		int size = 0;
		for(int i = 0;i<a.length;i++)
			{
				count = 0;
				for(int j = 0;j<a.length;j++) {
					if(a[i]==a[j])
						count++;
				}
				if(count == 1) {
				size++;
				}
			}
		int aa[] = new int[size];
		int z = 0;
		for(int i = 0;i<a.length;i++)
		{
			count = 0;
			for(int j = 0;j<a.length;j++) {
				if(a[i]==a[j])
					count++;
			}
			if(count == 1) {
			aa[z++]=a[i];
			}
		}
		System.out.println("no repeated ");
		for(int i = 0;i<aa.length;i++)
		{
			System.out.println(aa[i]);
		}
		
	}

}

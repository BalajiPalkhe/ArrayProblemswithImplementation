package Opps;

public class uniquepair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3,4};
		
		int [] b=removeDuplicate(a);
		
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = i+1; j < b.length; j++) 
			{
				System.out.println(b[i]+" "+b[j]);
				
			}
			
		}
	}

	private static int[] removeDuplicate(int[] a) {
		// TODO Auto-generated method stub
		int array=0;
		for (int i = 0; i < a.length; i++) 
		{
			int c=0;
			for (int j = 0; j < i; j++) 
			{
				if(a[i]==a[j])
					c++;
				
			}
			if(c==0)
				array++;
			
		}
		
		int[] b=new int[array];
		
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			int c=0;
			for (int j = 0; j < i; j++) 
			{
				if(a[i]==a[j])
					c++;
				
			}
			if(c==0)
				b[index++]=a[i];
			
		}
		
		
		return b;
	}

}

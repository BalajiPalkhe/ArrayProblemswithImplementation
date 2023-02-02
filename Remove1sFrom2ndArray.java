package practice;

public class Remove1sFrom2ndArray 
{
	public static void main(String[] args) 
	{
		int[] n={1,2,4};
		
		int[] a= {1,1,2,3,1,1,4,4,3,6,5};
		
		for (int i = 0; i < n.length; i++) 
		{
			a=remove(a,n[i]);
		}

		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]+" ");
		}
	}

	private static int[] remove(int[] a, int num) 
	{
		int count=0;

		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==num)
				count++;
		}
		
		if(count>2)
			count=2;

		int[] b=new int[a.length-count];
		
		int index=0;

		int removedCount=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			if(removedCount==2 || a[i]!=num)
				b[index++]=a[i];
			else
				removedCount++;
		}
		return b;
	}

}

package practice;

public class RemoveDuplicateAndGiveNewLength 
{

	public static void main(String[] args) 
	{
		int[] a= {1,2,3,6,5,8,4,6,5,8,5};
		
		int[] b=arrayAfterRemovingDuplicate(a);
		
		System.out.println(b.length);

	}

	private static int[] arrayAfterRemovingDuplicate(int[] a) 
	{
		int arrayLength=0;
		for (int i = 0; i < a.length; i++) 
		{
			int count=duplicateCount(a,i);
			if(count==0)
				arrayLength++;
		}
		
		int[] b=new int[arrayLength];
		int index=0;
		for (int i = 0; i < b.length; i++) 
		{
			int count=duplicateCount(a, i);
			if(count==0)
			{
				b[index++]=a[i];
			}
		}
		
		return b;
	}

	private static int duplicateCount(int[] a, int i) 
	{
		int count=0;
		for (int j = 0; j < i; j++) 
		{
			if(a[i]==a[j])
			{
				count++;
			}
			
		}
		return count;
	}

}

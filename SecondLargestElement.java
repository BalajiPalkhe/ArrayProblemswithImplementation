package practice;

public class SecondLargestElement 
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,6,5,8,4,6,5,8,5};
		
		int max=findMax(a);
		
		int secondMax=findSecondMax(a,max);

		System.out.println(secondMax);
	}

	private static int findSecondMax(int[] a, int max)
	{
		int max2=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<max && a[i]>max2)
				max2=a[i];
		}
		return max2;
	}

	private static int findMax(int[] a) 
	{
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}

}

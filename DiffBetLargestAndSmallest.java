package practice;

public class DiffBetLargestAndSmallest 
{

	public static void main(String[] args) 
	{
		int[] a= {1,2,3,6,5,8,4,6,5,8,5};
		
		int max=findMax(a);
		int min=findMin(a);
		
		int diffBetMaxAndMin=max-min;
		System.out.println(diffBetMaxAndMin);
	}

	private static int findMin(int[] a) 
	{
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<min)
				min=a[i];
		}
		return min;
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

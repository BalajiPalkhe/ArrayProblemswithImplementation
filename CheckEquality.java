package practice;

public class CheckEquality 
{

	public static void main(String[] args) 
	{

		int[] a= {1,2,3,6,5,8,4,6,5,8,5};
		
		int[] b= {1,2,3,6,5,8,4,6,5,8,5};
		
		
		if(a.length==b.length)
		{
			boolean result=checkEquality(a,b);
			if(result)
				System.out.println("Equal");
			else
				System.out.println("Not Equal");
			
		}
		else
		{
			System.out.println("Not Equal");
		}
	}

	private static boolean checkEquality(int[] a, int[] b) 
	{
		for (int i = 0; i < b.length; i++) 
		{
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}

}

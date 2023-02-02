package practice;

public class Replace0with1 
{

	public static void main(String[] args) 
	{
		int[] a= {1,2,0,6,5,0,4,0,5,0,5};
		replace0with1(a);
		print(a);
	}

	private static void print(int[] a) 
	{
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}

	private static void replace0with1(int[] a) 
	{
		for (int j = 0; j < a.length; j++) 
		{
			if(a[j]==0)
			a[j]=1;
		}
	}
}

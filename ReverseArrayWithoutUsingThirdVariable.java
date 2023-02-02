package practice;

public class ReverseArrayWithoutUsingThirdVariable 
{

	public static void main(String[] args) 
	{

		int[] a= {1,2,3,6,5,8,4,6,5,8,5};
		
		int[] b=new int[a.length];
		
		int index=0;
		for (int i = a.length-1; i >=0; i--) 
		{
			b[index++]=a[i];
		}
		
		for (int i : b) 
		{
			System.out.print(i+" ");
			
		}
	}

}

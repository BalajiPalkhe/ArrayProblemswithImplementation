package practice;

public class RightRotateArray 
{

	public static void main(String[] args) 
	{
		int[] a= {1,2,3,6,5,8,4,6,5,8,5};
		
		int[] b=new int[a.length];
		int temp=a[a.length-1];
		for (int i = 0; i < a.length-1; i++) 
		{
			b[i+1]=a[i];
		}
		b[0]=temp;
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(b[i]+" ");
		}
	}
}

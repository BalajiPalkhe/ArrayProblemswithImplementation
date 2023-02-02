package practice;

public class OddEvenArray 
{

	public static void main(String[] args) 
	{

		int[] a= {1,2,3,6,5,8,4,6,5,8,5};
		
		int ecount=0;
		int ocount=0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
				ecount++;
			else
				ocount++;
		}
		
		int[] evenArray=new int[ecount];
		int[] oddArray=new int[ocount];
		int eindex=0;
		int oindex=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				evenArray[eindex++]=a[i];
			}
			else
			{
				oddArray[oindex++]=a[i];
			}
			
		}
		
		print(evenArray);
		System.out.println();
		print(oddArray);
		
	}

	private static void print(int[] Array) 
	{
		for (int i = 0; i < Array.length; i++) 
		{
			System.out.print(Array[i]+" ");
			
		}
	}

}

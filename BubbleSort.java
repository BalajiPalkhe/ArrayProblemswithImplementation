package practice;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int[] a= {1,85,65,6,95,5};
		
		for (int i = 0; i < a.length; i++) 
		{
			int b=a.length-1;
			for (int j = 0; j < b; j++) 
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					b--;
				}
			}
		}	
			for (int i : a) {
				System.out.println(i);	
		}
	}
}

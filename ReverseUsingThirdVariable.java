package practice;


public class ReverseUsingThirdVariable 
{

	public static void main(String[] args) 
	{

		int[] a= {1,2,3,6,5,8,4,6,5,8,5};
		
		int i=0;
		int j=a.length-1;
		
		while(i<j)
		{
			//swap
			
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		
		for(int k=0; k<a.length; k++)
			System.out.println(a[k]);
	}

}

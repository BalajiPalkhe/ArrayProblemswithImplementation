package Opps;

public class selectionSort {

	public static void main(String[] args) 
	{
		int[] a= {1,6,8,8,9,9};
		
		for (int i = 0; i < a.length; i++) 
		{
			int min=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[min]>a[j])
					min=j;
			}
			
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		print(a);

	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}

package practice;

public class CopyArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,6,5,8,4,6,5,8,5};
		
		int[] b=new int[a.length];
		
		for (int i = 0; i < b.length; i++) 
		{
			b[i]=a[i];
			
		}
		
		for (int i : b) 
		{
			System.out.println(i+" ");
			
		}
	}

}

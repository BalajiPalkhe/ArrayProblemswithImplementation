package practice;

public class InsertionSort 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {1,5,8,6};
		
		for (int i = 0; i < a.length; i++) {
			int j=i-1;
			for(; j>=0; j--) {
			if(a[j]<a[i])
				break;
			}
			rightShift(a,j+1,i);
		}
				
		for (int i : a) {
			System.out.println(i);
		}
				

	}

	private static void rightShift(int[] a, int e, int s) {
		// TODO Auto-generated method stub
		
		int temp=a[s];
		
		for(int p=s;p>e; p--)
			a[p]=a[p-1];
			a[e]=temp;
	}

}

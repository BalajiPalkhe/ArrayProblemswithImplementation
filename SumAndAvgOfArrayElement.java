package practice;

public class SumAndAvgOfArrayElement {

	public static void main(String[] args) {

		int[] a= {1,2,3,6,5,8,4,6,5,8,5};
		double sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			sum=sum+a[i];
			
		}
		System.out.println("sum of element : "+sum);
		double avg=sum/a.length;
		System.out.println("Average of elements : "+avg);
	}

}

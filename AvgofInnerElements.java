package practice;

public class AvgofInnerElements {

	public static void main(String[] args) {

		int[][] a= {
				{1,2,3,4},
				{5,8,4,5},
				{5,6,7,9},
				{1,2,3,4},
				{1,2,3,4}
				};
		
		int sum=0;
		int count=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				if((i>0 && i<a.length-1 && j>0 && j<a[i].length-1) || (j>0 && j<a[i].length-1 && i>0 && i<a.length-1))
				{
					sum=sum+a[i][j];
					count++;
				}
				
			}
			
		}
		int avg=sum/count;
		System.out.println(avg);

	}

}

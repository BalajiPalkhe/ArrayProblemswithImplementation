package Opps;

public class avgOfTwoDArray {

	public static void main(String[] args) {
		
		int[][] a= {{1,2,3},{2,3,4},{5,6,7}};
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				sum=sum+a[i][j];
				
			}
			
		}
		
		double avg=sum/a.length;
		System.out.println(avg);
	}

}

package practice;

public class MaxElementInMatrix 
{

	public static void main(String[] args) {

		int[][] a= {
				{1,2,3,4},
				{5,8,4,5},
				{5,6,60,9},
				{1,2,3,4},
				{1,2,3,4}
				};
		
		
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(a[i][j]>max)
					max=a[i][j];
			}
			
		}
		System.out.println(max);
		
		
	}

}

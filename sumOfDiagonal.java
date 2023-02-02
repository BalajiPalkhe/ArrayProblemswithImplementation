package Opps;

public class sumOfDiagonal {

	public static void main(String[] args) 
	{
		int[][] a= {{1,2,3,4,1,5},
				{5,8,4,5},
				{5,6,7,9},
				{1,2,3,4}};
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(j-i==0 || j+i==3)
				sum=sum+a[i][j];
			}
		}
		System.out.println(sum);
	}

}

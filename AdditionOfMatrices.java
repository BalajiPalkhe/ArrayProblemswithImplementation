package practice;

public class AdditionOfMatrices 
{
	public static void main(String[] args) {
		int[][] a= {{1,2,3,4,1,5},
				{5,8,4,5},
				{5,6,7,9},
				{1,2,3,4}};

		
		int[][] b= {{1,2,3,4,1,5},
				{5,8,4,5},
				{5,6,7,9},
				{1,2,3,4}};

		int[][] c=new int[4][4];
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				c[i][j]=a[i][j]+b[i][j];
			}
			
		}
		
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c.length; j++) 
			{
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
			
		}

	}

}

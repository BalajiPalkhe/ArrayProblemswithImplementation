package practice;

public class DisplayInnerElements {

	public static void main(String[] args) 
	{

		int[][] a= {
				{1,2,3,4},
				{5,8,4,5},
				{5,6,5,9},
				{1,2,3,4},
				
				};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(i==0 || j==0 || i==a.length-1 || j==a[i].length-1)
					System.out.print(" ");
				else
					System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
			
		}
	}

}

package Opps;

public class SadlePoint {

	public static void main(String[] args) {


		int[][] a= {
				{6,3,1},
				{9,7,8},
				{2,4,5}
		};
		
		int count=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				//boolean smallestInRow=isSmallestInRow(a,i,j);
				if(isSmallestInRow(a,i,j) && isLargestInCol(a,i,j))
				{
					//boolean largestInCol=isLargestInCol(a,i,j);
//					if(isLargestInCol(a,i,j))
//					{
						System.out.println(a[i][j]);
						count++;
//					}
				}
			}
		}
		if(count==0)
			System.out.println("No Sadle Point");
	}
	private static boolean isLargestInCol(int[][] a, int i, int j) {
		for (int k = 0; k < a[i].length; k++) 
		{
			if(a[k][j]>a[i][j])
				return false;
		}
		return true;
	}
	private static boolean isSmallestInRow(int[][] a, int i, int j) {
		
		for (int k = 0; k < a[i].length; k++) 
		{
			if(a[i][k]<a[i][j])
				return false;
		}
		return true;
	}
}

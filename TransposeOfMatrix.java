package practice;


public class TransposeOfMatrix 
{

	public static void main(String[] args) 
	{
		int[] a= {1,5,8,0};
		
		int[] b= {1,5,8,5};
		
		int[] c= {8,5,8,6};
		
		int[] r= {8,5,8,5};
		
		int[][] d= {a,b,c,r};
		
		int[][] t=new int[d.length][d[0].length];
		
		for (int i = 0; i < t.length; i++) 
		{
			for (int j = 0; j < t[0].length; j++) 
			{
				t[i][j]=d[j][i];
			}
			
		}
		
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[0].length; j++) {
				System.out.print(t[i][j]+" ");
			}
			System.out.println();
		}

	}

}

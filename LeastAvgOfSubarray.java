package practice;

public class LeastAvgOfSubarray 
{
		public static void main(String[] args) 
		{
			int []a= {88,99,33,7,8,6,7,8,66,5,10};
			
			int k=3;
			int min=Integer.MAX_VALUE;
			int index=0;
			for(int i=0; i<a.length-k+1; i++) 
			{
				int sum=0;
				for(int j=i; j<i+k; j++) 
				{
					sum=sum+a[j];
				}
				int avg=sum/k;
				if(avg<min) 
				{
					min=avg;
					index=i;
				}
			}
			System.out.println("Least Average : "+min+"\n"+"First index of subarray : "+index);

		}
}


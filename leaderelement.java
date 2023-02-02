package Opps;

public class leaderelement {

	public static void main(String[] args) {
		
		int[] a= {10,50,60,40,80,65,24,30,40};
		
		for (int i = 0; i < a.length; i++) 
		{
			int count=0;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]>a[i])
					count++;
			}
			if(count==0)
				System.out.println(a[i]);
		}

	}

}

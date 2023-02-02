package practice;

public class FindTheIndex {

	public static void main(String[] args) {
		int[] a= {1,2,3,6,5,8,4,6,5,8,5};
		
		int element=5;
		int c=0;
		for(int i=0; i<a.length;i++)
		{
			if(a[i]==element)
			{
				System.out.println("found at index : "+i);
				c++;
			}
		}
		if(c==0)
			System.out.println("not found");

	}

}

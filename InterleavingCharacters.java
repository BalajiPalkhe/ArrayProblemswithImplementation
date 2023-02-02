package practice;

public class InterleavingCharacters 
{
	public static void main(String[] args) 
	{
		char[] a= {'a','b','c','d','e','f'};
		char[] b= {'p','q'};
		
		char[] c=new char[a.length+b.length];
		int index=0;
		for (int i = 0; i < c.length; i++) 
		{
			if(i<a.length)
			{
				c[index++]=a[i];
			}
			if(i<b.length)
			{
				c[index++]=b[i];
			}
		}
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print(c[i]+" ");
		}
	}
}

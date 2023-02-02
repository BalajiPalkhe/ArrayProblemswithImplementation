package practice;

public class SpecificValue {

	public static void main(String[] args) {

		int[] a= {1,2,3,6,5,8,4,6,5,8,5};
		
		int ele=4;
		
		int index=isValuePresent(a,ele);
		if(index==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index : "+index);
	}

	private static int isValuePresent(int[] a, int ele) {
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==ele)
				return i;
			
		}
		return -1;
	}

}

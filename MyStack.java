package Opps;

public class MyStack {

	int[] a=new int[5];
	int index=0;
	void put(int num)
	{
		//put---add element at end
		if(index<a.length)
		{
			a[index++]=num;
		}
		else
		{
			System.out.println("Queue is full");
		}
	}
	
	//give element of index 0
	//left shift 
	public int get()
	{
		if(index>0)
		{
			index--;
			return a[index];
			
			
		}
		else
		{
			System.out.println("Queue is empty");
			return 0;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		MyStack m=new MyStack();
		
		m.put(2);
		m.put(1);
		m.put(7);
		m.put(8);
		m.put(10);
		m.put(6);
		
		System.out.println(m.get());
		System.out.println(m.get());
		System.out.println(m.get());
		System.out.println(m.get());
		System.out.println(m.get());
		System.out.println(m.get());
		
		m.put(7);
		m.put(8);
		
		System.out.println(m.get());
	
		System.out.println(m.get());
	}
	

	

}

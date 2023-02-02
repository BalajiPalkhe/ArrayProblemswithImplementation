package Opps;

public class MyQueue 
{
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
			int temp=a[0];
			for (int i = 0; i < a.length-1; i++) 
			{
				a[i]=a[i+1];
			}
			index--;
			return temp;
			
			
		}
		else
		{
			System.out.println("Queue is empty");
			return 0;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		MyQueue m=new MyQueue();
		
		m.put(2);
		m.put(85);
		m.put(78);
		m.put(5);
		m.put(1);
		
		System.out.println(m.get());
		System.out.println(m.get());
		System.out.println(m.get());
		
		m.put(1);
		m.put(5);
		m.put(7);
		
		System.out.println(m.get());
		System.out.println(m.get());
		System.out.println(m.get());
		System.out.println(m.get());
		System.out.println(m.get());
		System.out.println(m.get());
		System.out.println(m.get());
	}

}

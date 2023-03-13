package Assignment_java;

import java.util.ArrayList;
import java.util.Iterator;

public class Ass48_ArrayList {

	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Red");
		a1.add("Blue");
		a1.add("Yellow");
		a1.add("Purple");
		a1.add("Green");
		a1.add("Black");
		a1.add("White");
		a1.add("Pink");
		a1.add("Orange");
		
		//First Method
		Iterator i1=a1.iterator();
		while(i1.hasNext()) 
		{
			System.out.println(i1.next());
		}
		System.out.println();
		
		//Second method
		
		for(String name : a1)
		{
			System.out.println(name);
		}
		System.out.println();
		
		//Third Method
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
	}
}

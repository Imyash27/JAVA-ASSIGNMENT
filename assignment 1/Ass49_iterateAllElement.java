package Assignment_java;

import java.util.ArrayList;
import java.util.Iterator;

public class Ass49_iterateAllElement {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(123);
		a1.add(456);
		a1.add(789);
		a1.add(101112);
		
		//First Method
		Iterator i1=a1.iterator();
		while(i1.hasNext()) 
		{
			System.out.println(i1.next());
		}
		System.out.println();
		
		//Second method
		
		for(Integer no : a1)
		{
			System.out.println(no);
		}
		System.out.println();
		
		//Third Method
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}

	}

}

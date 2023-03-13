package Assignment_java;

import java.util.ArrayList;

public class Ass52_update_specific_elemrnent {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(132);
		a1.add("Yash");
		a1.add("Red");
		a1.add("Blue");
		a1.add("Yellow");
		a1.add("Purple");
		a1.add("Green");
		a1.add("Black");
		
		System.out.println(a1);
		a1.set(1, "Rahul");
		a1.set(5, "Surendrangar");
		a1.set(3, "Bca");
		System.out.println(a1);
		
	}

}

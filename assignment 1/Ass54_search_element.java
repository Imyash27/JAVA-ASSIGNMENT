package Assignment_java;

import java.util.ArrayList;

public class Ass54_search_element {

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
		
		if(a1.contains("Red"))
		{
			System.out.println("element found");
		}
		else
			System.out.println("elenmrnt not found");
	}

}

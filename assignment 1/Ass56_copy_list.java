package Assignment_java;

import java.util.ArrayList;
import java.util.Collections;

public class Ass56_copy_list {

	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Yash");
		a1.add("Red");
		a1.add("Blue");
		
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Green");
		a2.add("White");
		a2.add("Black");
		System.out.println("List 1 "+a1);
		System.out.println("List 2 "+a2);
		Collections.copy(a2, a1);
		System.out.println("List 2 "+a2);
		
	}

}

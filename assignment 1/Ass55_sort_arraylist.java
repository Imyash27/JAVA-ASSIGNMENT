package Assignment_java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ass55_sort_arraylist {

	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Yash");
		a1.add("Red");
		a1.add("Blue");
		a1.add("Yellow");
		a1.add("Purple");
		a1.add("Green");
		a1.add("Black");
		
		
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
	}

}

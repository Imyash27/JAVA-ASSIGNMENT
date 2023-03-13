package Assignment_java;

import java.util.ArrayList;

public class Ass50_insert_first_array {

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(132);
		a1.add("Yash");
		//System.out.println(a1.size());
		System.out.println(a1);
		a1.add(0,"first element");
		System.out.println(a1);
	}
}

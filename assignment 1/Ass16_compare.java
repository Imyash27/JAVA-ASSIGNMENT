package Assignment_java;

import java.util.Scanner;

public class Ass16_compare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s1=sc.nextLine();
		System.out.println("Enter String To Compare");
		String s2=sc.nextLine();
		int cp=s1.compareTo(s2);
		if(cp==0)
		{
			System.out.println("Both Are Same");
		}
		else
			System.out.println("Both Not Same");
	}
}

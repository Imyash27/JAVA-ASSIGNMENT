package Assignment_java;

import java.util.Scanner;

public class Ass17_last2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First String");
		String s1=sc.nextLine();
		
		System.out.println("Enter Second String");
		String s2=sc.nextLine();
		
		int s1length=s1.length();
		char s1last=s1.charAt(s1length-1);
		char s1last1=s1.charAt(s1length-2);
		
		int s2length=s2.length();
		char s2last=s2.charAt(s2length-1);
		char s2last1=s2.charAt(s2length-2);
		
		if(s1last==s2last && s1last1==s2last1)
		{
			System.out.println(s1last1+" "+s1last+" "+"Both Last Character Same As "+s2last1+" "+s2last);
		}
		else
			System.out.println("Last 2 Character Not same");
	}
}

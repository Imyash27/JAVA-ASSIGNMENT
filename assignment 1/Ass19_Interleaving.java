package Assignment_java;

import java.util.Scanner;

public class Ass19_Interleaving {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String");
		String st1=sc.nextLine();
		System.out.println("Enter Second String");
		String st2=sc.nextLine();
		
		if(st1.length()==2 && st2.length()==2)
		{
			char s1w1=st1.charAt(0); //w
			char s1w2=st1.charAt(1); //x
			
			char s2w1=st2.charAt(0); //y
			char s2w2=st2.charAt(1); //z
			
			System.out.println(s2w1+" "+s1w1+" "+s2w2+" "+s1w2);
			System.out.println(s1w1+" "+s2w1+" "+s2w2+" "+s1w2);
			System.out.println(s2w1+" "+s1w1+" "+s1w2+" "+s2w2);
			System.out.println(s1w1+" "+s1w2+" "+s2w1+" "+s2w2);
			System.out.println(s2w1+" "+s2w2+" "+s1w1+" "+s1w2);
			System.out.println(s1w1+" "+s2w1+" "+s1w2+" "+s2w2);
		}
		else
			System.out.println("Enter Only 2 Words");
		
		
		
	}

}

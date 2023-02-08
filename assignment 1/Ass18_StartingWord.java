package Assignment_java;

import java.util.Scanner;

public class Ass18_StartingWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String");
		String st1=sc.nextLine();
		System.out.println("Enter Second String");
		String st2=sc.nextLine();
		
		char w1=st1.charAt(0);
		char w2=st1.charAt(1);
		char w3=st1.charAt(2);
		
		char w12=st2.charAt(0);
		char w22=st2.charAt(1);
		char w32=st2.charAt(2);
		
		if(w1==w12 && w2==w22 && w3==w32)
		{
			System.out.println("first 3 word are same");
		}
		else
			System.out.println("first 3 word are not same");
	}

}

package Assignment_java;

import java.util.Scanner;

public class Ass2_vowel {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Any One Alphabets :- ");
		String word=sc.nextLine().toLowerCase();
		sc.close();
		int length=word.length();
		if(length==1)
		{
			boolean as=word.matches("[a-zA-Z]");
			char w=word.charAt(0);
			if(as)
			{
				if (w == 'a' || w == 'e' || w == 'i' || w == 'o' || w == 'u')
		            System.out.println(w+" It is a Vowel.");
		        else
		            System.out.println(w+" It is a Consonant.");	
			}
			else
				System.out.println("Enter Only Alphabets..");
		}
		else
			System.out.println("Enter Only Single Value");
	}
}

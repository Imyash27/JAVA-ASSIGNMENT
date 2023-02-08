package Assignment_java;

import java.util.Scanner;

public class Ass14_positionIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("Enter String :- ");
		String word=sc.nextLine();
		
		System.out.println("Enter Index Of String");
		int index=sc1.nextInt();
		
		System.out.println(word.charAt(index));

	}

}

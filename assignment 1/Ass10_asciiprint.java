package Assignment_java;

import java.util.Scanner;

public class Ass10_asciiprint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value");
		char word=sc.next().charAt(0);
		sc.close();
		int c=word;
		System.out.println("ASCII Value IS :- "+c);
	}

}

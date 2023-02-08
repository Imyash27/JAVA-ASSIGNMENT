package Assignment_java;

import java.util.Scanner;

public class Ass15_concate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1");
		String s1=sc.nextLine();
		System.out.println("Enter String 2");
		String s2=sc.nextLine();
		System.out.println(s1.concat(s2));	
	}
}

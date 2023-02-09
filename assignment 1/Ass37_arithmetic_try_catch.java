package Assignment_java;

import java.util.Scanner;

public class Ass37_arithmetic_try_catch {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter no 1");
			int a=sc.nextInt();
			System.out.println("enter no 2");
			int b=sc.nextInt();
			System.out.println("division :- "+(a/b));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

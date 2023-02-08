package Assignment_java;

import java.util.Scanner;

public class Ass3_leapyear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year");
		int year=sc.nextInt();
		sc.close();
		if(year%4==0)
			System.out.println(year+" Is Leap Year");
		else
			System.out.println(year+" Is Not Leap Year");
	}
}

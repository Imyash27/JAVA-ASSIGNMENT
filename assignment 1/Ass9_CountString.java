package Assignment_java;

import java.util.Scanner;

public class Ass9_CountString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String wordString = sc.nextLine();
		sc.close();
		System.out.println(wordString.length());
	}
}

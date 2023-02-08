package Assignment_java;

import java.util.Scanner;

public class ASS11_valueofformat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :- ");
		int no=sc.nextInt();
		sc.close();
		System.out.println(no+"+"+no+""+no+"+"+no+""+no+""+no);
	}
}

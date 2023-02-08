package Assignment_java;

import java.util.Scanner;

public class Ass8_NumberDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number");
		int no=sc.nextInt();
		sc.close();
		if(no>0)
		{
			String num=Integer.toString(no);
			int length=num.length();
			System.out.println("Number Of Digits :- "+length);
		}
		else
			System.out.println("Enter Only Greater Than 0 Number");
	}

}

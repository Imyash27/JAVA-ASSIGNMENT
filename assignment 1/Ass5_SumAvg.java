package Assignment_java;

import java.util.Scanner;

public class Ass5_SumAvg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0,no;
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter Number "+i);
			no=sc.nextInt();
			sum=sum+no;
		}
		sc.close();
		System.out.println("SUM :- "+sum);
		Float avg=(sum/5f);
		System.out.println("AVERAGE :- "+avg);
	}
}

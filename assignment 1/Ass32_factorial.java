package Assignment_java;

import java.util.Scanner;

class fact
{
	public void Factorial(int no)
	{
		int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial Is "+fact);
	}
}
public class Ass32_factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Number ");
		int n=sc.nextInt();
		
		fact f1=new fact();
		f1.Factorial(n);
		sc.close();

	}

}

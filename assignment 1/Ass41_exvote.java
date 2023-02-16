package Assignment_java;
import java.util.Scanner;

class vote
{
	public void display (int age)
	{
		if (age > 18)
		{
			System.out.println("Welcome To Vote ");
		}
		else
		{
			throw new ArithmeticException("not valid");
		}
	}
}

public class Ass41_exvote {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age := ");
		int age=sc.nextInt();
		vote v1=new vote();
		try 
		{
			v1.display(age);
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}

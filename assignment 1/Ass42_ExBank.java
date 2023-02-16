package Assignment_java;

import java.util.Scanner;

class atmexception extends Exception
{
	double need;
	public atmexception(double need) {
		this.need=need;
	}
	
}

class atm
{
	double deposit,withdraw,balance;
	
	public void deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Deposit Amount :- ");
		deposit=sc.nextDouble();
		balance+=deposit;
	}
	
	public void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Withdrawal Amount :- ");
		withdraw=sc.nextDouble();
	}
	
	public void check() throws atmexception
	{
		if(withdraw <= balance)
		{
			System.out.println("Withdraw Amount "+withdraw+" RS Succesfully");
		}
		else
		{
			double need=withdraw-balance;
			throw new atmexception(need);
		}
	}
}

public class Ass42_ExBank {

	public static void main(String[] args) 
	{
		atm a1=new atm();
		a1.deposit();
		a1.withdraw();
		try {
			a1.check();
		} catch (atmexception e) 
		{
			System.out.println("Sorry, insufficient balance, you need more "+e.need +" Rs. To perform this transaction..");
		}
	}

}

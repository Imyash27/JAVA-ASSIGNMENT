package Assignment_java;

abstract class Bank
{
	int a=100,b=150,c=200;
	public abstract void getBalance();
}

class BankA extends Bank
{

	@Override
	public void getBalance() {
		System.out.println("Bank A deposit "+a+"$");
		
	}
	
}
class BankB extends Bank
{

	@Override
	public void getBalance() {
		System.out.println("Bank B deposit "+b+"$");
		
	}
	
}
class BankC extends Bank
{

	@Override
	public void getBalance() {
		System.out.println("Bank C deposit "+c+"$");
		
	}
	
}

public class Ass30_bankdeposit {

	public static void main(String[] args) {
		
		BankA b1=new BankA();
		b1.getBalance();
		BankB b2=new BankB();
		b2.getBalance();
		BankC b3=new BankC();
		b3.getBalance();
	}

}

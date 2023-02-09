package Assignment_java;

abstract class parentAB
{
	public abstract void message();
	public void show()
	{
		System.out.println("this is parent class");
	}
}

class subclass1 extends parentAB
{
	@Override
	public void message()
	{
		System.out.println("this is first sub class");	
	}	
}

class subclass2 extends parentAB
{
	@Override
	public void message() {
		System.out.println("this is second sub class");
	}
}

public class Ass29_abstract {

	public static void main(String[] args) 
	{
		subclass1 p1=new subclass1();
		p1.message();
		subclass2 p2=new subclass2();
		p2.message();
	
	}

}


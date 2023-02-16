package Assignment_java;

class check1 extends Thread
{
	public void run()
	{
			System.out.println("hello world");	
	}
	
}

public class Ass47_same_thread {

	public static void main(String[] args)
	{
		check1 c1=new check1();
		c1.start();
		c1.start();
	}

}

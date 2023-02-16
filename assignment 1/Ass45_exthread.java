package Assignment_java;

class th4 extends Thread
{
	public void run()
	{
		System.out.println("this is thread class");
	}
}

public class Ass45_exthread {

	public static void main(String[] args)
	{
		th4 th=new th4();
		th.start();
	}
}

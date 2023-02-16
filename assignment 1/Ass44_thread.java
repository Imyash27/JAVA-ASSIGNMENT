package Assignment_java;

class th implements Runnable
{

	@Override
	public void run() {
		System.out.println("This Is Runnable Thread");	
	}
}

public class Ass44_thread {

	public static void main(String[] args)
	{
		th t1=new th();
		Thread th1=new Thread(t1);
		th1.start();
	}
}

package Assignment_java;

class check extends Thread
{
	public void run()
	{
		try {
			
			for(int i=0;i<5;i++)
			{
				sleep(2000);
				System.out.println("hello class"+i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

public class Ass46_thread2 {

	public static void main(String[] args) 
	{
		check c1=new check();
		c1.start();
		try 
		{	
			for(int i=0;i<5;i++)
			{
				Thread.sleep(2000);
				System.out.println("hello  main"+i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}

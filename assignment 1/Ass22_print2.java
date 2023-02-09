package Assignment_java;

class print
{
	public void printnumber(int a,char b)
	{
		System.out.println("integer is "+a);
		System.out.println("Char is "+b);
	}
	
	public void printnumber(char a,int b)
	{
		System.out.println("integer is "+b);
		System.out.println("Char is "+a);
	}
}

public class Ass22_print2 {

	public static void main(String[] args) {
		
		print p1=new print();
		p1.printnumber(50, 'w');
		p1.printnumber('w',50);

	}

}

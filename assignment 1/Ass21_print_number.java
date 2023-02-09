package Assignment_java;

import java.util.Scanner;

class Print_Number
{
	public void printn(int a)
	{
		System.out.println("int value is..."+a);
	}
	public void printn(double a)
	{
		System.out.println("double value is..."+a);
	}
	public void printn(float a)
	{
		System.out.println("float value is..."+a);
	}
	/*public void printn(long a)
	{
		System.out.println("long value is..."+a);
	}
	*/
	public void printn(String a)
	{
		System.out.println("String value is..."+a);
	}
	public void printn(boolean a)
	{
		System.out.println("boolean value is..."+a);
	}
	public void printn(char a)
	{
		System.out.println("char value is..."+a);
	}
}

public class Ass21_print_number {

	public static void main(String[] args)
	{
		Print_Number n1=new Print_Number();
		n1.printn(123); //int 
		n1.printn(123.065464644660); //double
		n1.printn(1235.244f);//float
		//n1.printn(923544546);//long
		n1.printn("yash");//String
		n1.printn(true);//boolean 
		n1.printn('w');//Char
	
		
		
		
		
	}

}

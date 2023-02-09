package Assignment_java;

class Shape1
{
	public void display()
	{
		System.out.println("this is shape");
	}
}
class Rectangle extends Shape1
{
	public void display1()
	{
		System.out.println("this is rectangle");
	}
}
class Circle extends Shape1
{
	public void display2()
	{
		System.out.println("this is circle");
	}
}
class square1 extends Rectangle
{
	public void display3()
	{
		System.out.println("Square is a rectangle");
	}
}
public class Ass35_shapescr {

	public static void main(String[] args) {
		square1 s1=new square1();
		s1.display();
		s1.display1();

	}

}

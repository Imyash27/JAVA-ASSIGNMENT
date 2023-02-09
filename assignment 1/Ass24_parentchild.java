package Assignment_java;

class parent
{
	public void show1()
	{
		System.out.println("this is parent class");
	}
}
class child extends parent
{
	public void show()
	{
		System.out.println("this is child class");
	}
}

public class Ass24_parentchild {

	public static void main(String[] args) {
		parent p1=new parent();
		child c1=new child();
		p1.show1();
		c1.show();
		c1.show1();
	}
}

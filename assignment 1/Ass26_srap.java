package Assignment_java;

class retangle
{
	int length,breadth;
	public retangle(int a,int b) {
		length=a;
		breadth=b;
	}
	public void area()
	{
		System.out.println("retangle area is "+(length*breadth));
	}
	
	public void perimeter()
	{
		int perimeter=2*(length+breadth);
		System.out.println("Retangle Perimeter is "+perimeter);
	}
}

class square extends retangle
{
	int s;
	public square(int a) {
		super(a,a);
		s=a;
	}
	
	public void sarea()
	{
		System.out.println("square area is "+(s*s));
	}
	
	public void sperimeter()
	{
		System.out.println("square Perimeter is "+(4*s));
	}
}

public class Ass26_srap {

	public static void main(String[] args) {
		square s1=new square(20);
		s1.area();
		s1.perimeter();
		s1.sarea();
		s1.sperimeter();

	}

}

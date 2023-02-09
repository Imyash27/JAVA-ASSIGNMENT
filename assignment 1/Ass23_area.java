package Assignment_java;
class area
{
	public void find(int a)
	{
		System.out.println("square area is "+(a*a));
	}
	public void find(int h,int w)
	{
		System.out.println("Rectangle area is "+(h*w));
	}
}

public class Ass23_area {

	public static void main(String[] args) {
		area a1=new area();
		a1.find(5);
		a1.find(80,50);
	}

}

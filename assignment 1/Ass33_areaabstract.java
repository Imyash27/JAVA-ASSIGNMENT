package Assignment_java;

abstract class Shape
{
	public abstract void RetangleArea(int l,int w);
	public abstract void SquareArea(int side);
	public abstract void CircleArea(int radius);
}
class Area1 extends Shape
{

	@Override
	public void RetangleArea(int l,int w) {
		System.out.println("Retangle Area Is :- "+(l*w));
	}

	@Override
	public void SquareArea(int side) {
		System.out.println("Square Area Is :- "+(side*side));
	}

	@Override
	public void CircleArea(int radius) {
		double area=radius/(2*Math.PI);		
		System.out.println("Circle Radius Is :-"+area);
	}
	
}
public class Ass33_areaabstract {

	public static void main(String[] args) {
		try {
			Area1 a1=new Area1();
			a1.CircleArea(20);
			a1.RetangleArea(20, 20);
			a1.SquareArea(20);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}

package Assignment_java;

abstract class mark
{
	public abstract void getPer();
}
class studentA extends mark
{
	int sub1,sub2,sub3;
	public studentA(int a,int b,int c) {
		sub1=a;
		sub2=b;
		sub3=c;
	}

	@Override
	public void getPer() {
		
		float per=(sub1+sub2+sub3)/3f;
		System.out.println("per of student a is "+per);
	}
}
class studentB extends mark
{
	int sub1,sub2,sub3,sub4;
	public studentB(int a,int b,int c,int d) {
		sub1=a;
		sub2=b;
		sub3=c;
		sub4=d;
	}
	@Override
	public void getPer() {
		float per=(sub1+sub2+sub3+sub4)/4f;
		System.out.println("per of student a is "+per);
	}	
}
public class Ass31_mark {

	public static void main(String[] args)
	{
		studentA s1=new studentA(55, 62, 89);
		studentB s2=new studentB(90, 70, 60, 45);
		
		s1.getPer();
		s2.getPer();
	}
}

package Assignment_java;

class ageex extends Exception
{
	int age;
	public ageex(int age) 
	{
		this.age=age;
	}
}

class exname extends Exception
{
	String name;
	public exname(String name)
	{	
		this.name=name;
	}
}

class student
{
	int rno,age;
	String name,course;
	public student(int rno, int age, String name, String course)
	{
		this.rno = rno;
		this.age = age;
		this.name = name;
		this.course = course;
		try {
			check();
		} catch (ageex e) {
			
			System.out.println("AgeNotWithinRangeException");
		} catch (exname e) {
			
			System.out.println("NameNotValidException");
		}
	}
	
	public void check() throws ageex, exname
	{
		if(age >= 15 && age <= 21)
		{
			boolean as=name.matches("^[a-zA-Z]+$");
			if(as)
			{
				System.out.println("ROll NO :- "+rno);
				System.out.println("NAME :- "+name);
				System.out.println("Age :- "+age);
				System.out.println("COURSE :- "+course);
			}
			else
			{
				throw new exname(name);
			}
		}
		else
		{
			throw new ageex(age);
		}
	}
}

public class Ass43_exStudent {

	public static void main(String[] args)
	{
		student s1=new student(101, 18, "Yash", "BCA");
	}

}

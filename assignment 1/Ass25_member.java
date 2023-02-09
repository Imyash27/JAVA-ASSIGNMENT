package Assignment_java;

class Member
{
	int DataMember=101;
	int Age=20;
	long PhoneNumber=1236547890;
	int Salary=50000;
	String Name="yash";
	String Address="Surendranagar";
	
	public void printSalary()
	{
		System.out.println("Data Member "+DataMember);
		System.out.println("Age "+Age);
		System.out.println("Phone Number "+PhoneNumber);
		System.out.println("Salary "+Salary);
		System.out.println("Namer "+Name);
		System.out.println("Address "+Address);
	}
}

public class Ass25_member {

	public static void main(String[] args) {
		
		Member m1=new Member();
		m1.printSalary();	
	}
}

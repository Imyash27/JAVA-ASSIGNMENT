package Assignment_java;

import java.util.Scanner;

class grade
{
	public void grade(int mark)
	{
		if(mark>=0 && mark<=100)
		{
			if(mark<=100&&mark>=91)
				System.out.println("Grade Is :- AA");
			else if(mark<=90&&mark>=81)
				System.out.println("Grade Is :- AB");
			else if(mark<=80&&mark>=71)
				System.out.println("Grade Is :- BB");
			else if(mark<=70&&mark>=61)
				System.out.println("Grade Is :- BC");
			else if(mark<=60&&mark>=51)
				System.out.println("Grade Is :- CD");
			else if(mark<=50&&mark>=41)
				System.out.println("Grade Is :- DD");
			else
				System.out.println("You Are Fail");
		}
		else
			System.out.println("Enter Mark Between 0 to 100");
	}
}

public class Ass34_grademarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mark ");
		int mark=sc.nextInt();
		grade g=new grade();
		g.grade(mark);
		sc.close();
	}
}

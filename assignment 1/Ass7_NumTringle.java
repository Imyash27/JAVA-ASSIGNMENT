package Assignment_java;

public class Ass7_NumTringle {
	public static void main(String[] args) {
		/*
		 * 1
		 * 23
		 * 456
		 * 78910*/
		int no=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(no);
				no=no+1;
			}
			System.out.println();
		}
	}
}

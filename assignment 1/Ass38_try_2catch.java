package Assignment_java;

public class Ass38_try_2catch {

	public static void main(String[] args) {
		try {
			
			int a=10;
			int b=0;
		    int c=a/b;
			
			int ab[]=new int[5];
			ab[5]=5;
			
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}

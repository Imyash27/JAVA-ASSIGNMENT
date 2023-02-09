package Assignment_java;

public class Ass36_trycatch {

	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			System.out.println(a/b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

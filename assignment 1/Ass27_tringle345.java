package Assignment_java;

import java.util.Scanner;

class tringle
{
	public tringle() {
		tri3side();
		tri4side();
		tri5side();
	}
	
	public void tri3side() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Value For 3 Side Tringle ");
		int a=sc.nextInt();
		System.out.println("Enter Second Value For 3 Side Tringle ");
		int b=sc.nextInt();
		System.out.println("3 Side Tringle Area Is "+(a*b)/2);
	}
	
	public void tri4side() {
		
	}
	
	public void tri5side() {
		
	}
}

public class Ass27_tringle345 {

	public static void main(String[] args) {
		 tringle t1=new tringle();

	}

}

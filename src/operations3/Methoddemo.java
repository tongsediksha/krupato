package operations3;
import java.util.Scanner;
public class Methoddemo {
	int a=15;
	int b=12;
	public void sum() {
		int c= a+b;
		System.out.println("addition is"+c);
	}
	public void sub() {
		int d=a-b;
		System.out.println("substraction is"+d);
	}
public void mul() {
	int e= a*b;
	System.out.println("multiplication is"+e);
}

	public static void main(String[] args) {
		System.out.println("hi programme is started.....");

	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the two number");
		//error in nextint i should be capital
		int x = sc.nextInt();
		int y = sc.nextInt();
		 
		System.out.println(x+y);
		Methoddemo obj = new Methoddemo();
		obj.sum();
		obj.mul();
	}
}
	
	


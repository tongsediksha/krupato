package operations3;
import java.util.Scanner;
public class Scannerpractise {
int a=17;
int b=16;
public void sum() {
	int k= a+b;
	System.out.println(k);
}
public void sub() {
	int z= a-b;
	System.out.println(z);
}
public void mul() {
	int k= a*b;
	System.out.println(k);
}
	public static void main(String[] args) {
		System.out.println("program is started");
		Scanner sc= new Scanner(System.in );
	System.out.println("enter the two number");
	int l=sc.nextInt();
	int q=sc.nextInt();
	System.out.println(l+q);
	Scannerpractise b= new Scannerpractise();
	b.mul();
	b.sum();
b.sub();
	}

}

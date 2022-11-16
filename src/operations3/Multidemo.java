package operations3;

public class Multidemo {
int a=15;
int b=3;
public int mul() {
	int f=a*b;
	System.out.println(f);
return f;
}
	public int div() {
		int g=a/b;
		System.out.println(g);
		return g;
	}
	
	public static void main(String[] args) {
		Multidemo s=new Multidemo ();
		int m =s.mul();
		System.out.println("multiplication is"+m);
		int y= s.div();
		System.out.println("division is"+y);
		
		

	}

}

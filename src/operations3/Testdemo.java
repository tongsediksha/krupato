package operations3;

public class Testdemo {
	
	int a=12;
	int b=8;
	public int sum() {
		// if we use void then we cant return value but if we have to return value then we use int and return commond
		int c = a+b;
		System.out.println( "addition is"+c);
	return c;
	}
	public int sub() {
		int d = a-b;
		System.out.println("substraction is"+d);
		return d;
	}
		public static void main (String[]args) {
			
			Testdemo  s = new Testdemo();
             //s.sum(); if we use void
			//or we can use int sum method then commond like as follows
			int g = s.sum();
			System.out.println(g);
		    int f	= s.sub();
			System.out.println(f);
			
	}
}



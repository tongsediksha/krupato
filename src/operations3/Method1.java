package operations3;

public class Method1 {
	int a=12;
	int b=8;
	public int sum() {
		int c= a+b;
		return c;
		
	}
    public int addition(int d,int h) {
    int k=d+h;
    return k;
}
    public float substraction() {
	int h=a-b;
	return h;
}
	public double sum(int x,float h,double j) {
	double l= x+h+j;
	return l;
	}
	public void m1(String s){
		
	System.out.println("parameter is"+s);
	}
	public static void Main (String[]args) {
	Method1 S =new Method1();
        		S.m1("fghh");
		
		double u= S.sum(45, 6.4f, 78.8);
		System.out.println(u);
		
       int z = S.addition(99, 3);
		
		System.out.println("Parameterized method "+z);

		 int g =  S.sum();

		 System.out.println( g);		        
		 float t = S.substraction();
	      
		System.out.println("Substraction is "+t);
	}

}


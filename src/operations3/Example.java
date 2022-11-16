package operations3;

public class Example {
		
		int a=226;
		int b=113;
    public  void mul() {
			
		int c= a*b;
		System.out.println( c);
	}
	
	public int div() {
		int f= a/b;
//when statement there is no void we have to return value
		return f;
	}
	
public static void main(String[] args) {
	
	Example v= new Example();//object creation= class name variable=new class name ();
	v.mul();
	int s=v.div();//call the function
	System.out.println(s);
	 


	}

}

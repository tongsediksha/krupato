package operations3;

public class Practise {
	
	int x=1234;
	int y=1342;
	public int sum() {
		int z= x+y;
		return z;
	}
 public int sub() {
	int m=x-y;
	return m;
}
 public static void main(String[] args) {
		Practise obj = new Practise ();
		int l= obj.sum();//object get created
		System.out.println(l);
		int b = obj.sub();
		System.out.println("substraction is"+b);
	
		
	}

}

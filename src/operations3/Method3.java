package operations3;

public class Method3 {
	int a=17;
	int b=18;
	float k=16.7f;
	public int sum(int a,int b){
		int z=a+b;
		return z;
		
	}
	public String sad ( String h) {
		System.out.println("parameter is "+h);
		return h;
	}

	public static void main(String[] args) {
		Method3 n= new Method3();
		String k=n.sad("kumar");
	int x=	n.sum(78, 9);
	System.out.println(x);

	}

}

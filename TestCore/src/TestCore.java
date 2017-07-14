
public class TestCore {

	float a;
	public static void main(String[] args) {
		TestCore t = new TestCore();
		//t.hello(222);
		
		//System.out.println(t.a);
		
		byte a=10;  
		byte b=10;
		b+=a;
		//byte c=a+b;//Compile Time Error: because a+b=20 will be int  
		byte c=(byte)(a+b);  
		System.out.println(c);
	}

	void hello(int a){
		System.out.println("hello a " + a);
	}
	
	void hello(long a){
		System.out.println("hello a long " + a);
	}
	
	void hello(float a){
		System.out.println("hello a float " + a);
	}
	
	void hello(double a){
		System.out.println("hello a double " + a);
	}
}

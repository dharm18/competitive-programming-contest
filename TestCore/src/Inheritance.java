
public class Inheritance {

	
	public static void main(String[] args) {
		A a = new B();
		a.show();
		
		/*B b = (B) new A();
		b.show();*/
		
	}
	
}

class A{
	
	A(){
		System.out.println("const A");
	}
	
	void show(){
		System.out.println("A");
	}
	
	void show(int a){
		System.out.println("A");
	}
	
	
	void show(double a){
		System.out.println("A");
	}
}


class B extends A{
	
	B(){
		System.out.println("const B");
	}
	void show() {
		super.show();
		System.out.println("B");
	}
}

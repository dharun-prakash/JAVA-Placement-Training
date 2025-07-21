package day11;


// pubic method
class A{
	public void method() {
		System.out.println("Hello From Folder Demo Method");
	}
}

// private method 
class B{
	private void method1() {
		System.out.println("Hello from private method in demo method 1");
	}
	void method2() {
		method1();
	}
}

class C{
	private int a = 10;
	int b = a;
}

public class DemoClass{
	public static void main(String[] args) {
		B obj2 = new B();
		obj2.method2();
		C obj3 = new C();
		System.out.println(obj3.b);
		
	}
	
}


package day10;

abstract class A{
	void method();
	void method2();
	void method3() {
		System.out.println("Apple Cloud");
	}
	
}

public class AnonymousClass {
	
	public static void main(String[] args) {
		A obj = new A(){
			void method() {
				System.out.println("Apple");
			}
			void method2() {
				System.out.println("Music");
			}
		};
		obj.method();
		obj.method2();
		obj.method3();
		
	}

}

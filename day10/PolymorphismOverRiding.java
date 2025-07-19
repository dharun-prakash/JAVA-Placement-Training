package day10;

class Parent{
	void method() {
		System.out.println("Hello");
	}
}

class Child extends Parent{
	void method() {
		super.method();
		System.out.println("hi");
	}
}

public class PolymorphismOverRiding {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.method();
		
		
	}

}

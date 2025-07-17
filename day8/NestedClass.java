package day8;

class A{
	int a = 10;
	class B{
		int b = 20;
		class C{
			int c = 30;
		}
	}
}

public class NestedClass {
	public static void main(String[] args) {
		A obj1 = new A();
		A.B obj2 = obj1.new B();
		A.B.C obj3= obj2.new C();
		System.out.println(obj1.a);
		System.out.println(obj2.b);
		System.out.println(obj3.c);

	}

}

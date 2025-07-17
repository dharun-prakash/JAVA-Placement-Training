package day8;

public class WithArgsWithReturnInt {
	public static void main(String[] args) {
		Number obj = new Number();
		int a = obj.add(10, 20);
		System.out.println(a);
		System.out.println(obj.add(20, 30));
		System.out.println(Number.sub(20, 10));
	}
	

}

class Number{
	int add(int a , int b) {
		return a + b;
	}
	
	static int sub(int a , int b) {
		return a - b;
	}
}

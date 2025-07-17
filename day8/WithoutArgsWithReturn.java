package day8;

public class WithoutArgsWithReturn {
	int add() {
		int a = 10;
		int b = 20;
		return a+b;
	}
	
	static int sub() {
		int a = 20;
		int b = 10;
		return a-b;
	}
	
	public static void main() {
		WithoutArgsWithReturn obj = new WithoutArgsWithReturn();
		int a = obj.add();
		System.out.println(a);
		System.out.println(obj.add());
		System.out.println(sub());
		
	}

}

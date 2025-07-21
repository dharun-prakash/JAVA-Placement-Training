package day11;

class A_Throws{
	void method() throws ArithmeticException{
		System.out.println(10/0);
	}
}

public class ThrowsExceptionBlock {
	public static void main(String[] args) {
		A_Throws obj = new A_Throws();
		try {
			obj.method();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

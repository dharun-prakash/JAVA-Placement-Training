package day7;

class NumberClass{
	static int a = 10;
	
}

public class StaticObjectCreationInClass {
	public static void main(String[] args) {
		NumberClass num = new NumberClass();
		num.a = 20;
		System.out.println(num.a);
		NumberClass num1 = new NumberClass();
		num.a = 40;
		System.out.println(num.a);
		System.out.println(NumberClass.a);
		
		
	}

}

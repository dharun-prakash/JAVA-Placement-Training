package day8;

class Space2{
	int a,b;
	Space2(int a ,int b) {
		this.a = a;
		this.b = b;
	}
	void method1(){
		System.out.println(a+b);
		
	}
}

public class WithThisKeyword {
	public static void main(String[] args) {
		Space2 obj = new Space2(10,20);
		
		obj.method1();
		
		
		
		
	}

}

package day8;

class Space1{
	int n1,n2;
	Space1(int a ,int b) {
		n1 = a;
		n2 = b;
	}
	void method1(){
		System.out.println(n1+n2);
		
	}
}



public class WithoutThisKeyoword {
	public static void main(String[] args) {
		Space1 obj = new Space1(10,20);
		
		obj.method1();
		
		
		
		
	}

}

package day8;

class Space{
	String a = "PM Karthi";
	void method1(){
		String a = "Suriya Thambi Karthi";
		System.out.println(a);
	}
	void method2() {
		System.out.println(a);
	}
	
}

public class LocalInstanceVariable {
	public static void main(String[] args) {
		Space sp = new Space();
		sp.method1();
		sp.method2();
		
	}

}

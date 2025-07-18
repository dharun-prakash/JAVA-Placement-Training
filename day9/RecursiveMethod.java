package day9;

public class RecursiveMethod {
	
	static void msg() {
		System.out.println("Hellow");
//		Method Call By Itself
		msg();   
	}
	public static void main(String[] ags) {
		
		msg();
	}

}

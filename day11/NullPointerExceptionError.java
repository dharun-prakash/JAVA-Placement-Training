package day11;

public class NullPointerExceptionError {
	public static void main(String[] args) {
		String a = null;
		try {
			System.out.println(a.charAt(0));
		}catch(ArithmeticException e) {
			System.out.println("Arithmatic Error");
		}catch(NullPointerException e) {
			System.out.println("Null error");
		}
		
		
	}

}

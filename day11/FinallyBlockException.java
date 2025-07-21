package day11;

public class FinallyBlockException {
	public static void main(String[] args) {
		String a = null;
		try {
			System.out.println(a.charAt(0));
		}catch(ArithmeticException e) {
			System.out.println("Arithmatic Error");
		}catch(NullPointerException e) {
			System.out.println("Null error");
		}finally {
			System.out.println("It will excute even try or catch runs	");
		}
		
		
	}

}

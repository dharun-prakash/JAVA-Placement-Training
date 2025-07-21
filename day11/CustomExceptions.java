package day11;

class Stupid extends Exception{
	 Stupid(String s) {
		super(s);
	}
}

public class CustomExceptions {
	public static void main(String[] args) {
		int age = 12;
		if (age>=18){
			System.out.println("Adult");
		}else {
			try {
				 throw new Stupid("Not Child");
			}catch(Stupid e) {
				System.err.println(e);
			}
		}
		
	}

}

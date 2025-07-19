package day10;

abstract class Menu{
	abstract void idly();
	abstract void juice();  //non abstract method
//	non abstract or concreate method
	void briyani() {  
		System.out.println("RR Briyani - 20000");
	}
}

class Hotel extends Menu{
	void idly() {
		System.out.println("Spl Idly - 5000");
	}
	void juice() {
		System.out.println("Juice - 10000");
	}
}
public class AbstractClass {
	public static void main(String[] args) {
		Hotel htl = new Hotel();
		htl.idly();
		htl.juice();
		htl.briyani();
		
		
	}

}

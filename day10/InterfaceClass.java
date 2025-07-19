package day10;

interface M_Menu{
	void juice();
	void chicken();
}

class Preparation implements M_Menu{
	public void juice() {
		System.out.println("Apple Juice");
	}
	public void chicken() {
		System.out.println("Chicken Briyani");
		
	}
}

public class InterfaceClass {
	public static void main(String[] args) {
		Preparation prp = new Preparation();
		prp.juice();
		prp.chicken();
		
	}

}

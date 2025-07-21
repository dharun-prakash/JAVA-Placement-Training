package day10;

interface Father{
	void car();
}

interface Mother{
	void car();
}

class child implements Father,Mother{
	public void car() {
		System.out.println("BENZ");
	}
}

public class MultipleInheritance {
	public static void main(String[] args) {
		child ch = new child();
		ch.car();
		
	}

}

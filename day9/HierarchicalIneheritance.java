package day9;


class Visvak{
	void car() {
		System.out.println("Benz");
	}
}

class Sister extends Visvak{
	void mobile() {
		System.out.println("Samsung");
	}
}

class Brother extends Visvak{
	void laptop() {
		System.out.println("ASUS");
		
	}
}

public class HierarchicalIneheritance {
	public static void main(String[] args) {
		Brother obj1 = new Brother();
		System.out.println("Brother can access his laptop and visvak car but cant use sisters mobile " );
		obj1.laptop();
		obj1.car();
		Sister obj2 = new Sister();
		System.out.println("Sister can access his laptop and visvak car but cant use brother laptop " );
		obj2.mobile();
		obj2.car();
		
		
	}

}

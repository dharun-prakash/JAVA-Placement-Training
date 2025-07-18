package day9;


class GrandpaMoulee{
	void land() {
		System.out.println("10,000 sq feet");
	}
}

class FatherVetri extends GrandpaMoulee{
	void complex(){
		System.out.println("Complex");
	}
}

class UncleSelva extends GrandpaMoulee{
	void daughter() {
		System.out.println("Ruphaa Selvarasan");
	}
}

class ChildVisvak extends FatherVetri{
	void bike() {
		System.out.println("MT - 15");
	}
	
}
public class HybridInheritance {
	public static void main(String[] args) {
		ChildVisvak child = new ChildVisvak();
		System.out.println("Child Visvak can access his bike , fathers complex and grandpa land but cant access uncles daughter ruphaa ");
		child.bike();
		child.complex();
		child.land();
		FatherVetri father = new FatherVetri();
		father.complex();
		father.land();
		UncleSelva uncle = new UncleSelva();
		uncle.daughter();
		uncle.land();
		
	}

}

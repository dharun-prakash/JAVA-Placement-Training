package day9;

//Method Overloading
//same method name but different parameters
class Mec{
	void mec_canteen(String a,String b) {
		System.out.println("I want snacks "+a+" and "+b);
	}
	void mec_canteen(String a) {
		System.out.println("I want this "+a +" Food");
	}
}

//same method same parameter but different data type
class MceOver{
	void mce_content(String a) {
		System.out.println("Name is "+a);
	}
	void mce_content(int a) {
		System.out.println("Number is "+a);
	}
	
}
public class PolymorphismOverloading {
	public static void main(String[] args) {
		Mec m = new Mec();
		m.mec_canteen("Noodles");
		m.mec_canteen("Puffs","Egg");
		MceOver mo = new MceOver();
		mo.mce_content(13);
		mo.mce_content("Dharun");
		
	}

}

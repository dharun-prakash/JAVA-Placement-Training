package day8;

public class WithArgsWithoutReturn {
	void NameFood(String name,String food) {
		System.out.println("Name : "+ name + " Food : "+food);
	}
	static void FoodName(String name,String food){
		System.out.println("StaticName : "+ name + " StaticFood : "+food);
		
	}
	public static void main(String[] args) {
		WithArgsWithoutReturn obj = new WithArgsWithoutReturn();
		obj.NameFood("Dharun", "Pulli");
		FoodName("Monica", "Briyani");
	
	}

}

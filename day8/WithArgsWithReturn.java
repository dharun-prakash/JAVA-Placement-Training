package day8;

public class WithArgsWithReturn {
	
	String Value(String name , String food) {
		return ("FullName : " + name + "Food : "+food);
	}
	
	public static void main(String[] args) {
		WithArgsWithReturn obj = new WithArgsWithReturn();
		String a = obj.Value("Visvak","Curd");
		System.out.println(a);
		
		System.out.println(obj.Value("Visvak","Curd"));
		
	}

}

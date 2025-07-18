package day9;

class Rec{
	int method1(int base,int exp) {
		if (exp == 0) {
			return 1;
		}else {
			return base*method1(base, exp-1);
		}
	}
}

public class Task_59_Recursion_1 {
	public static void main(String[] args) {
		Rec r = new Rec();
		System.out.println(r.method1(2, 3));
		
	}

}

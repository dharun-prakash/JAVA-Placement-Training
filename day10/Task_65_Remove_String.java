package day10;

import java.util.Scanner;

//Method - 1
class Selva{
	String[] remove(String inp_1,String target ) {
		String a[] = inp_1.split(" ");
		for(int i = 0 ; i <a.length;i++) {
			if(target.equals(a[i])) {
				continue;
			}
			System.out.print(a[i]+ " ");

		}
		return a;
		
	}
	
}
//Method - 2
class Vetri{
	void remove(String inp_1,String target ) {
		String a[] = inp_1.split(target);
		for(int i = 0 ; i <a.length;i++) {
			System.out.print(a[i]);
		}
	}
	
}
//Method - 3
class Visvak{
	String[] remove(String inp_1,String target ) {
		String a[] = inp_1.split(target);
		return a;
	}
	
}

//Method - 4
class Moulee{
	String[] remove(String inp_1,String target ) {
		String a[] = inp_1.split(" ");
		for(int i = 0 ; i <a.length;i++) {
			if(!target.equals(a[i])) {
				System.out.print(a[i]+ " ");
			}
		}
		return a;
		
	}
	
}

public class Task_65_Remove_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input : ");
		String inp_1 = sc.nextLine();
		System.out.println("Enter the target : ");
		String target = sc.nextLine();
//		Selva se = new Selva();
//		se.remove(inp_1, target);
//		Vetri ve = new Vetri();
//		ve.remove(inp_1, target);
//		Visvak vi = new Visvak();
//		String a[] = vi.remove(inp_1, target);
//		for(int i = 0 ; i <a.length;i++) {
//			System.out.print(a[i]);
//		}
		Moulee mol = new Moulee();
		mol.remove(inp_1, target);	
	}

}

package day11;

public class Task_69_V_Pattern {
	public static void main(String[] args) {
		int a = 5;
		for(int i = 0; i<a ; i++) {
			for(int j = 0 ; j < a+a;j++) {
				if ( i == j || i+j ==(a+a)-2)  {
					System.out.print(j + ""+ i);
//				System.out.print("*");
			}else {
				System.out.print(" ");
			}		
		}
			System.out.println();
		
	}
	}
}

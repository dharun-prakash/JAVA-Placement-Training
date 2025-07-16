package day7;

import java.util.Scanner;

public class Task_47_SplitString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String a[] = name.split(" ");
		for(int i = 0 ; i < a.length ;i++) {
			if(a[i].equals("hello") ) {
				a[i] = "*";
			}
		}
		
		for (String  b : a) {
			System.out.println(b);
			
		}
		
	}

}

package day7;

import java.util.Scanner;

public class Task_48_MultiplyTheGivenCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
//		char value = word.charAt(1);
//		int num = (int)value;
//		int ascii = num - '0';  // 52 - 0 = the actual value for the ascii
//		System.out.println(ascii);  
//		for(int i = 0 ; i <= ascii ; i++) {
//			System.out.print(word.charAt(0));
//		}
		
//		char a[] = word.toCharArray();
		String a[] = word.split("");
		int num = Integer.parseInt(a[1]);
		System.out.println(num);
		for(int i = 0 ; i < num ; i++) {
		System.out.print(word.charAt(0));
	}
		
		
		
		
	}

}

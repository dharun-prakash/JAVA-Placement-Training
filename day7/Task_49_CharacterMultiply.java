package day7;

import java.util.Scanner;

import java.lang.String;

public class Task_49_CharacterMultiply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		char a[] = word.toCharArray();
		for(int i = 1 ; i <a.length;i+=2) {
			int num = a[i] - '0';
			for (int j = 0 ; j < num ; j++) {
				System.out.println(a[i-1]);
			}

		}
		
	}
	

}

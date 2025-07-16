package day7;

import java.util.Scanner;

public class Task_50_Remove_Duplicate_Char {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		char a[] = name.toCharArray();
		for (int i = 0; i <a.length;i++) {
			for (int j = i+1 ; j<a.length;j++) {
				if(a[i] == a[j]) {
//					 System.out.println("Repeated value :"+a[i]);
					 a[i] = '*';
				}
			}
		}
		for(int i = 0 ; i < a.length;i++) {
			if(a[i] != '*') {
				System.out.print(a[i]);
			}
			
		}
		
		
	}

}

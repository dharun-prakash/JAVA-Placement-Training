package day11;

import java.util.Scanner;

class check extends Exception{
	 check(String s) {
		 super(s);
	 }
}



public class Task_71_PalindromException {
	
	static boolean CheckPalidrom(String word){
		int left = 0;
		int right = word.length()-1;
		while(left<=right) {
			if(word.charAt(right)!= word.charAt(left)) {
				return false;
			}
			left++;
			right--;	
		}
		return true;	
	}
	public static void main(String[] args) throws check{
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		boolean result = CheckPalidrom(word);
		if(result) {
			System.out.println("Palindrom");
		}else {
			throw new check("Not Palidrom");
		}
		

		
	}

}

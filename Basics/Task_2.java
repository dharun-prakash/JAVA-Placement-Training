package Basics;

public class Task_2 {
	
	static String name = "DHARUN PRAKASH J A";
	static int age = 20;
	public static void main(String[] args) {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		details obj = new details();
		System.out.println("Department : "+obj.dept);
		System.out.println("Year : "+obj.year);
	}

}

class details{
	String dept = "AI&DS";
	int year = 4 ;
}

package day7;

public class ObjectCreationWithinTheClass {
	String username;
	int password;
	
	public static void main(String[] args) {
		ObjectCreationWithinTheClass user1 = new ObjectCreationWithinTheClass();
		user1.username = "yourboy_dp";
		user1.password = 12345;
		System.out.println(user1.username);
		System.out.println(user1.password);
		ObjectCreationWithinTheClass user2 = new ObjectCreationWithinTheClass();
		user2.username = "dp_yourboy";
		user2.password = 1234;
		System.out.println(user2.username);
		System.out.println(user2.password);
		
		
		
	}

}

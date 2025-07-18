package day9;

class Redo{
	int task (int i , int j) {
		if (i == 0)
			return 0;
		else {
			return task(i/j, j)+1;
		}
	}
}

public class Task_57_Hexaware_redo {
	public static void main(String[] args) {
		Redo rd = new Redo();
		System.out.println(	rd.task(82, 3));
		
	}

}

package day9;


class Cog{
	int metho1(int n) {
		if(n==0) {
			return 0;
		}else {
			return 1+metho1(n/10);
		}
		
	}
}

public class Task_60_Cognizent {
	public static void main(String[] args) {
		Cog c = new Cog();
		System.out.println(c.metho1(6571));
		
	}

}

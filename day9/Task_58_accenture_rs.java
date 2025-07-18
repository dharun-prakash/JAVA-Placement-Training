package day9;

class RsRecursion{
	int task(int n) {
		
		if(n<=1)
			return n;
		else {
			return n+ task(n-1);
		}
			
	}
}

public class Task_58_accenture_rs {
	public static void main(String[] args) {
		RsRecursion rs = new RsRecursion();
		System.out.println(rs.task(7));
		
	}

}

/*
 n = 7 
 else 7 + (7-1)
  n = 6 
 else 6 + (6-1)
  n = 5 
 else 5 + (5-1)
  n = 4 
 else 4 + (4-1)
  n = 3 
 else 3 + (3-1)
  n = 2 
 else 2 + (2-1)
  n = 1 
  if return 1 
  
  BackTracking 
  
 2 + 1 = 3
 3 + 3 = 6
 4 + 6 = 10
 5 + 10 = 15
 6 + 15 = 21
 7 + 21 = 28
 
 Ans = 28
 
 */

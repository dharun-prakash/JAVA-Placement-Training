package day12;

class A1{
	void m1() {
		for(int i = 0;i<=5;i++) {
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println("Error in A1");
			}
			System.out.println("M1 " + Thread.currentThread().getName());
			
		}
	}
}

class A2{
	void m2() {
		for(int i = 0;i<=5;i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println("Error in A2");
			}
			System.out.println("M2 "+Thread.currentThread().getName());
			
		}
	}
}

class A3 extends Thread{
	public void run() {
		for(int i = 0;i<=5;i++) {
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println("Error in A3");
			}
			System.out.println("M3 "+Thread.currentThread().getName());
			
		}
		
	}
}

class A4 extends Thread{
	public void run() {
		for(int i = 0;i<=5;i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println("Error in A4");
			}
			System.out.println("M4 "+Thread.currentThread().getName());
			
		}
		
	}
}

public class MultiThreadingConcept {
	public static void main(String[] args) {
//		A1 objA1 = new A1();
//		objA1.m1();
//		A2 objA2 = new A2();
//		objA2.m2();
		A3 objA3 = new A3();
		objA3.start();
		System.out.println(objA3.isAlive());
		A4 objA4 = new A4();
		objA4.start();
		objA4.setName("A4 Thread");
		try {
			objA3.join();
		}catch (Exception e) {
			System.out.println("Error in join");
		}
		System.out.println("The End");
		System.out.println(objA4.isAlive());
		
		
		
		
		
	}

}

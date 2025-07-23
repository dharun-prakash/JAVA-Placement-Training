package day12;

class A{
	void m1() {
		System.out.println("Class A");
	}
}

class B extends A  implements Runnable{
	public void run() {
		System.out.println("Class B "+ Thread.currentThread().getName());
	}
}

public class RunnableImplementsConcept {
	public static void main(String[] args) {
		B obj = new B();
		Thread t1 = new Thread(obj);
		t1.run();
	}

}

package day12;


class Assignment extends Thread{
	public void run() {
		for(int i = 0;i<5;i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println("Error in sleep");
			}
			System.out.println("Assignment "+i + Thread.currentThread().getName());
		}
	}
}

class Spotify extends Thread{
	public void run() {
		for(int i = 0;i<5;i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println("Error in sleep");
			}
			System.out.println("Song "+i + Thread.currentThread().getName());
		}
	}
}

public class Task_72_MulitiThreading {
	public static void main(String[] args) {
		
		Assignment obj1 = new Assignment();
		obj1.start();
		obj1.setName(" Assignment Class");
		Spotify obj2 = new Spotify();
		obj2.setName(" Spotify Class");
		obj2.start();
		System.out.println(obj1.isAlive());
		
		try {
			obj1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("The End");
		
		
		
	}

}

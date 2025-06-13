package xyz;
/*class car extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("BMW car moving"+ i);
			try {
				Thread.sleep(10);
			}catch(Exception e) {
				
			}
		}
	}
}
class Bike extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Ninja bike moving"+ i);
			try {
				Thread.sleep(10);
			}catch(Exception e) {
				
			}
		}
	}
}
public class sampleThreadsEX {

	public static void main(String[] args) {
		new car().start();
		new Bike().start();

	}

}*/
class car implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("BMW car moving"+ i);
			try {
				Thread.sleep(10);
			}catch(Exception e) {
				
			}
		}
	}
}
class Bike implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Ninja bike moving"+ i);
			try {
				Thread.sleep(10);
			}catch(Exception e) {
				
			}
		}
	}
}
public class sampleThreadsEX {

	public static void main(String[] args) {
		
		Thread carthread = new Thread(new car());
		Thread bikethread = new Thread(new Bike());
		System.out.println("Good");
		carthread.start();
		bikethread.start();
		

	}

} 
package xyz;


	class caar extends Thread{
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
class bike extends Thread{
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
public class ThreadRunnable {

	public static void main(String[] args) {
		new caar().start();
		new bike().start();

	}

}


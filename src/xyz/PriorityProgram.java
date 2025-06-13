package xyz;

public class PriorityProgram {

	public static void main(String[] args) {
		Thread lowPriorityThread = new Thread(()->{
		for(int i = 1;i<=5;i++) {
			System.out.println("Low Priiority Thread "+i);
		}
	});
		Thread HighPriorityThread = new Thread(() -> {
			for(int i=0;i<=5;i++) {
				System.out.println("High Priority Thread "+i);
			}
			});
			lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
			HighPriorityThread.setPriority(Thread.MAX_PRIORITY);
			
			lowPriorityThread.start();
			HighPriorityThread.start();
			
	}

}

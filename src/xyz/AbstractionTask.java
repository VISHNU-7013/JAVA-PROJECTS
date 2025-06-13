package xyz;

abstract class Car{
	abstract void start();
	abstract void drive();
	abstract void stop();
	void features() {
		System.out.println("Cars have the automatic gear system");
	}
}
/*public class Cars extends Car {
	void start() {
		System.out.println("Some cars have self Driving");
	}
	void drive() {
		System.out.println("Drive the car using the steering");
	}
	void stop() {
		System.out.println("Stop the car when you reach the destination");
	}
}
}*/

public class AbstractionTask extends Car {
	void start() {
		System.out.println("Some cars have self Driving");
	}
	void drive() {
		System.out.println("Drive the car using the steering");
	}
	void stop() {
		System.out.println("Stop the car when you reach the destination");
	}

	public static void main(String[] args) {
	
		AbstractionTask c = new AbstractionTask();
		c.start();
		c.drive();
		c.stop();
		c.features();

	}

}

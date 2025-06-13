package xyz;

class Animals{
	void food() {
		System.out.println("All animlas have common features");
	}
}

class dog extends Animals{
	void food() {
		System.out.println("Dog eat the meat");
	}
}
class cat extends Animals{
	void food() {
		System.out.println("Cat drink the milk");
	}
}

public class InheritanceTask {

	public static void main(String[] args) {
		Animals a = new Animals();
		Animals d = new dog();
		Animals c = new cat();
		a.food();
		d.food();
		c.food();

	}

}

package xyz;

public class OOPSTask {

	private String name;
	private int rollnum;
	private int marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public String checkResult() {
		if(marks>=40) {
			return "pass";
		}
		else {
			return "fail";
		}
	}
	
	public void displayDetails() {
		System.out.println("Roll num: " + getRollnum());
		System.out.println("Name: "+ getName());
		System.out.println("marks: "+ getMarks());
		System.out.println("Result: "+ checkResult());
	}
	public static void main(String[] args) {
		OOPSTask opt = new OOPSTask();
		opt.setMarks(45);
		opt.setName("Vishnu");
		opt.setRollnum(3390);
		
		opt.displayDetails();

	}

}

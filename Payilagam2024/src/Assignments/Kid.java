package Assignments;

public class Kid extends Mother {
	String name = "Suman";
	

	public static void main(String[] args) {
		
		Kid kid = new Kid();
		kid.study();
		
	}
	
	public void work() {
		System.out.println("Kid is working");
		System.out.println(name);
		System.out.println(super.name);

	}
	public void study() {
		System.out.println("Kid is studying");
		work();
		//super.work();
	
	}
}

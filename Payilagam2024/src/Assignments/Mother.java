package Assignments;

public class Mother extends Grandma {
	String name = "Arasi";
	public void work() {
		System.out.println(name);
		System.out.println(super.name);
		super.work();
	}
	
	
}

package Assignments;

public class School{
	 int mark;
	 private int salary;
	 static String school_name = "St. Antony's Primary School";
	 void conduct_exams(){
	 System.out.println("Annual exam");
	 }
	 void publish_results(int mark){
	 this.mark = mark;
	 System.out.println(this.mark); 
	}

	}

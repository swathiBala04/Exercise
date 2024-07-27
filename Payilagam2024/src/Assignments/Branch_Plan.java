package Assignments;

public abstract class Branch_Plan extends HeadOffice {

	public abstract void receive_Customers();
	public static void main(String args[]) {
		System.out.println("Calling from Main method");
		Branch branch = new Branch();
		int a = branch.pay_tax(100);
		System.out.println("Pay Tax " +a);
		branch.check_accounts(1000);
		branch.do_interview();
	}
	public void do_interview() {
		System.out.println("do interview");
	}

}

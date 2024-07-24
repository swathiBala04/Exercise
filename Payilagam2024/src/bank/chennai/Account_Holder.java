package bank.chennai;

public class Account_Holder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SBI customer1 = new SBI();
		customer1.empName = "John";
		customer1.empId = "A";
		String branchName = SBI.branch_name;
		System.out.println(branchName);
		customer1.create_account();
		customer1.get_loan(1900);
	}
		
		
		

	}



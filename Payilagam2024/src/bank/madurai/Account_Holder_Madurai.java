package bank.madurai;

import bank.chennai.SBI;

public class Account_Holder_Madurai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//not able to access all static, non-static variables and non-static methods in SBI class.
		//as they are package private
		//declared all static, non-static variables and non-static methods in SBI class as public
		SBI customer1 = new SBI();
		customer1.empName = "John";
		customer1.empId = "A";
		String branchName = SBI.branch_name;
		System.out.println(branchName);
		customer1.create_account();
		customer1.get_loan(1000);

	}

}

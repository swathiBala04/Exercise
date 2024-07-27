package basic.java.programs;

public class Bank {

	private static int bank_balance = 1000000;//class specific
	  void withdraw(int amount)
	  {
	    bank_balance = bank_balance - amount; 
	  }
	  public void deposit(int amount)
	  {
			System.out.println("Before deposit " +bank_balance);

	    bank_balance = bank_balance + amount; 
		System.out.println("After deposit " +bank_balance);

	  }	
	  private void give_salary()
		{
			
		}
	  
	  public Bank() //private Bank()
		{
			System.out.println("Bank Constructor");
		}
	
}

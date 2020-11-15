package bank;

public class DebitAccount extends BankAccount  {

	
	public DebitAccount() {
		super();
	}
	@Override
	double getBalance() {
		
		// TODO Auto-generated method stub
		return  super.balance;
	}
	@Override
	double setBalance(double balance) {
		// TODO Auto-generated method stub
		return super.balance += balance;
	}

}

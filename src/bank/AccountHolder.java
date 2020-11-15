package bank;



public class AccountHolder{

	private String username;
	private String password;
	private String name;
	private String address;
	private String mobileNumber;
	private double deposit;
	
	public AccountHolder(String username, String password, String name, String address, String mobileNumber, double deposit) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.deposit = deposit;
		

	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public String getNumber() {
		return this.mobileNumber;
	}
	
	public String getUsername() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}

	public double getDeposit() {
		return this.deposit;
	}
		
	public String toString() {
		return this.name +  "\n" + this.address+  "\n" + this.mobileNumber+  "\n";
	}
}

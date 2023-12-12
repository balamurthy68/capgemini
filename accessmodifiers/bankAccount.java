package accessmodifiers;

public class bankAccount {
	private int acctno;
	private float balance;
	
	public void createAccount(int num)
	{
		this.acctno=num;
		System.out.println("Account " + num + " has been created");
		
	}
	
	public void getbalance(int acno)
	{
		// write a sql query here that will fetch the balance for the acno and print it
		// simulating 
		this.balance = 200000;
		System.out.println("Balance for " + acno +" is " + balance);
	}
}

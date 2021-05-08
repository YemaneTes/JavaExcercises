//OOP part 2 Exercises

/*Create a class called Account  that includes four pieces of information as instance variables
First Name (String)
Last Name (String)
Account Number (long) 
Balance  (double)


Your class should have a constructor that initializes the four instance variables. 
Provide a set and a get method for each instance variable.

add methods called debit and credit
debit withdraws money from the Account. Ensure that the debit amount does not exceed the Account’s balance. If it does, the balance should be left unchanged and the method should print a message “Insufficient Balance”
Credit: that adds money to the balance and prints the final balance.
Create an account for “Hagos Gebru” Account number 10001 with an initial balance of $5000. Withdraw $3000 and deposit $1000.
Create an account for “James Bond” Account number 10002 with initial balance $3000 and withdraw $4000. 

Modify the Account class so that the account number auto increments every time a new account is created.
Hint: create static variable initialize to 10001 and increment it in the constructor.*/




package excercise6;

public class Account {
	
	private String fName;
	private String lName;
	private long  AcctNumber;
	private double balance;
	public static long acctNoGeneretor = 10001;
	
	
	public Account(String fName, String lName, long acctNumber, double balance) {
		super();
		this.fName = fName;
		this.lName = lName;
		acctNoGeneretor = acctNoGeneretor +1;
		this.AcctNumber = acctNoGeneretor;
		this.balance = balance;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public long getAcctNumber() {
		return AcctNumber;
	}


	public void setAcctNumber(long acctNumber) {
		AcctNumber = acctNumber;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [fName=" + fName + ", lName=" + lName + ", AcctNumber=" + AcctNumber + ", balance=" + balance
				+ "]";
	}
	
	
	public void debit (double withdrawMoney) {
		if (balance < withdrawMoney) {
			System.out.println("Insuficient Balance");
		} 
		
		else 
		{
		balance =   balance - withdrawMoney;
		System.out.println ("withdrawal"+ ":" + withdrawMoney + " " + "Current Balance" + ":" + balance);
	}
	
	
	}
	public void credit (double depositMoney) {
		balance =   balance + depositMoney;
		System.out.println ("Deposit"+ ":" + depositMoney + " " + "Current Balance" + ":" + balance);

	}
	
	
}
	

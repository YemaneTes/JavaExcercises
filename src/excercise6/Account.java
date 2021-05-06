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
	

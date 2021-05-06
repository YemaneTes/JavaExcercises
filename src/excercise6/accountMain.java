package excercise6;

public class accountMain {

	public static void main(String[] args) {
		
		Account hagosAcct = new Account ("Hagos", "Gebru", 10001, 5000);
		Account jamesAcct = new Account ("James", "Bond", 10002, 3000);
		
		System.out.println(hagosAcct);
		hagosAcct.debit(3000);
		hagosAcct.credit(1000);
		
		System.out.println(jamesAcct);
		jamesAcct.debit(4000);


	}

}

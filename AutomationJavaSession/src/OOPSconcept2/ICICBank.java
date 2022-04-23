package OOPSconcept2;

public class ICICBank implements USBank,BrazilBank,UKBank { //Achieving multiple inheritance
	
	//
	public void credit() {
		System.out.println("ICICI ---> credit");
	}
	
	public void debit() {
		System.out.println("ICICI ---> Debit");
	}
	
	public void transferMoney() {
		System.out.println("ICICI ---> Transfer Money");
	}
	
	public void educationalLoan() {
		System.out.println("ICICI --> Educational Loan");
	}
	
	public void carLoan() {
		System.out.println("ICICI ---> Car Loan");
	}
	
	//Brazil Bank method: Overriding from brazilBank
	public void mutualFund() {
		System.out.println("ICICI ---> Mutual Fund");
	}
	
	public void UKcredit() {
		System.out.println("ICICI ---> UKcredit");
	}
	
}

package OOPSconcept2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(USBank.min_bal);
		//USBank.min_bal = 200; ---> This is not possible
		
		ICICBank hs = new ICICBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationalLoan();
		hs.carLoan();
		hs.mutualFund();
		hs.UKcredit();
		
		//Dynamic Polymorphism
		//child class object can be reffered by parent INterface reference variable
		USBank b = new ICICBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
		
	}

}

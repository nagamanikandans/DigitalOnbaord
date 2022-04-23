package OOPSconcept2;

public interface USBank {

	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//Only method declaration
	//no Method body -- only method prototype
	// interface are abstract in nature
	// We can not create an object in interface
	// Interface does not have main method
	// no static method in interface
	// values will not be changed and it is final/constant in nature
	
}

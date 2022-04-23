package test;

import org.testng.annotations.Test;

public class check {

	String firstname = "Nagamanikandan";
	
	@Test
	public void loginTest(String firstname) {
		System.out.println(firstname);
	}
}

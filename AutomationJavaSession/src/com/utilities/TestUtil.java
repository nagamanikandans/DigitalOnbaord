package com.utilities;

import java.util.ArrayList;

public class TestUtil {

	
	public static ArrayList<Object[]> getDataFomExcel() {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		Xls_Reader reader = new Xls_Reader("D:\\Selenium\\AutomationTraining\\AutomationJavaSession\\src\\com\\testdata\\RediffMailData.xlsx");
		
		
		for(int rowNum = 2; rowNum <= reader.getRowCount("RediffTestData");rowNum++) {
			
			String afirstname = reader.getCellData("RediffTestData", "fullname", rowNum);
			String amail1 = reader.getCellData("RediffTestData", "mail1", rowNum);
			String apassword1 = reader.getCellData("RediffTestData", "password1", rowNum);
			String apassword2 = reader.getCellData("RediffTestData", "password2", rowNum);
			String amail2 = reader.getCellData("RediffTestData", "mail2", rowNum);
			String amobilenumber = reader.getCellData("RediffTestData", "mobilenumber", rowNum);
			
			Object ob[] = {afirstname,amail1,apassword1,apassword2,amail2,amobilenumber}; // Data stored in object Array
			myData.add(ob); // Add object array to the arrayList
		}
		
		return myData;
	}
}

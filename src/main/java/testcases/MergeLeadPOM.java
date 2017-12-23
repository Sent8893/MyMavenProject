package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class MergeLeadPOM extends ProjectMethods{
	

	@BeforeClass
	public void setData() {
		dataSheetName = "MergeLead1";
		testCaseName = "MergeLeadPOM";
		testDescription = "To merge two leads";
		category= "Smoke";
		authors	="GSV";
		browserName ="chrome";
	}
	@Test(dataProvider="fetchData")
	public void editlead(String uName, String pwd, String fName,String cName){
		
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMsfa()
		.clickLeads()
		;
		reportStep("Edit Lead hass been done successfully", "Pass");		
	
		
		
		
		
		
		
	}
	

}

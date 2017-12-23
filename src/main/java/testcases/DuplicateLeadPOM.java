package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class DuplicateLeadPOM extends ProjectMethods {
	
	@BeforeClass
	public void setData() {
		dataSheetName = "DuplicateLead1";
		testCaseName = "DuplicateLeadPOM";
		testDescription = "To duplicate an lead";
		category= "Smoke";
		authors	="GSV";
		browserName ="chrome";
	}
	@Test(dataProvider="fetchData")
	public void duplicatelead(String uName, String pwd, String email,String fName){
		
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMsfa()
		.clickLeads()
		.clickFindlead()
		.clickemail()
		.enteremail(email)
		.clickFindleadBtn()
		.clickFirstResult()
		.clickduplicate()
		.VerifyTitle()
		.clickcreate()
		.Verifyname(fName);
		reportStep("Duplicate Lead hass been done successfully", "Pass");
		
		
		
		
		
		
	}
	

}

package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class EditLeadPOM extends ProjectMethods{
	

	@BeforeClass
	public void setData() {
		dataSheetName = "EditLead1";
		testCaseName = "EditLeadPOM";
		testDescription = "To edit an lead";
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
		.clickFindlead()
		.enterfirstname(fName)
		.clickFindleadBtn()
		.clickFirstResult()
		.clickEdit()
		.entercompname(cName)
		.clickUpdate()
		.VerifyComp(cName);
		reportStep("Edit Lead hass been done successfully", "Pass");		
	
		
		
		
		
		
		
	}
	

}

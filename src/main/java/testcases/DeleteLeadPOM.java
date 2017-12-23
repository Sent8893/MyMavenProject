package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class DeleteLeadPOM extends ProjectMethods{
	

	@BeforeClass
	public void setData() {
		dataSheetName = "DeleteLead1";
		testCaseName = "DeleteLeadPOM";
		testDescription = "To delete an lead";
		category= "Smoke";
		authors	="GSV";
		browserName ="chrome";
	}
	@Test(dataProvider="fetchData")
	public void editlead(String uName, String pwd, String phone,String lead){
		
		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMsfa()
		.clickLeads()
		.clickFindlead()
		.clickphone()
		.enterphoneno(phone)
		.clickFindleadBtn()
		.clickFirstResult()
		.clickdelete()
		.clickFindlead()
		.enterlead(lead)
		.clickFindleadBtn()
		.Verifytext();
		reportStep("Delete Lead hass been done successfully", "Pass");		
	
		
		
		
		
		
		
	}
	

}

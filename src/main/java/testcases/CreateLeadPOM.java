package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class CreateLeadPOM extends ProjectMethods{
	
	@BeforeClass
	public void setData() {
		dataSheetName = "CreateLead1";
		testCaseName = "CreateLeadPOM";
		testDescription = "To create a lead";
		category= "Smoke";
		authors	="GSV";
		browserName ="chrome";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String uName, String pwd, String cName,String fName,String lName,String source,String camp,String fNLocal, String lNLocal,String pTitle,String ProfTitle,
			String department,String Revenue,String currencyUomId,String industryEnumId,String Employees,String ownershipEnumId,String sicCode,String tickerSymbol,
			String description,String importantNote,String AreaCode,String PhoneNumber,String Extension,String AskForName,String Email,String WebUrl,String ToName,
			String AttnName,String Address1,String Address2,String CountryGeoId,String State,String PostalCode,String City,String PostalCodeExt) throws InterruptedException {
		
		new LoginPage(driver, test)
		
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMsfa()
		.clickLeads()
		.clickCreateLead()
		.enterCName(cName)
		.enterFname(fName)
		.enterLname(lName)
		.selectSource(source)
		.selectCampaign(camp)
		.enterfnlocal(fNLocal)
		.enterlnlocal(lNLocal)
		.enterpTitle(pTitle)
		.enterProfTitle(ProfTitle)
		.enterdept(department)
		.enterrvnu(Revenue)
		.selectCurrency(currencyUomId)
		.selectindustry(industryEnumId)
		.enteremployee(Employees)
		.selectowner(ownershipEnumId)
		.entersicCode(sicCode)
		.entertSymbol(tickerSymbol)
		.enterdesc(description)
		.enterinote(importantNote)
		.enterareacode(AreaCode)
		.enterphone(PhoneNumber)
		.enterextn(Extension)
		.enteraskname(AskForName)
		.enterEmail(Email)
		.enterweburl(WebUrl)
		.entertoname(ToName)
		.enterattnName(AttnName)
		.enteraddress1(Address1)
		.enteraddress2(Address2)
		.selectCountryId(CountryGeoId)
		.selectState(State)
		.enterpostcode(PostalCode)
		.entercity(City)
		.enterpstextn(PostalCodeExt)
		.clickSubBtn()
		.VerifyName(fName);
		reportStep("Lead hass been created successfully", "Pass");		
		
	}

}

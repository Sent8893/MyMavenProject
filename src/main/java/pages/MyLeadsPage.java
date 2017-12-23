package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement createlead;
	public MyLeadsPage clickCreateLead() {
		click(createlead);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCName;
	
	public MyLeadsPage enterCName(String cName) {
		type(eleCName, cName);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFName;
	
	public MyLeadsPage enterFname(String fName) {
		type(eleFName, fName);
		return this;
		
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLName;
	public MyLeadsPage enterLname(String lName) {
		type(eleLName, lName);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_dataSourceId")
	private WebElement eleSource;
	public MyLeadsPage selectSource(String src) {
		selectDropDownUsingText(eleSource, src);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_marketingCampaignId")
	private WebElement elecamp;
	public MyLeadsPage selectCampaign(String camp) {
		selectDropDownUsingIndex(elecamp, Integer.parseInt(camp));
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstNameLocal")
	private WebElement elefLocal;
	public MyLeadsPage enterfnlocal(String fLocal) {
		type(elefLocal, fLocal);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastNameLocal")
	private WebElement elelLocal;
	public MyLeadsPage enterlnlocal(String lLocal) {
		type(elelLocal, lLocal);
		return this;
		
	}
	@FindBy(how=How.ID,using="createLeadForm_personalTitle")
	private WebElement elepTitle;
	public MyLeadsPage enterpTitle(String pTitle) {
		type(elepTitle, pTitle);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_generalProfTitle")
	private WebElement elepProfTitle;
	public MyLeadsPage enterProfTitle(String ProfTitle) {
		type(elepProfTitle, ProfTitle);
		return this;
		
	}
	@FindBy(how=How.ID,using="createLeadForm_departmentName")
	private WebElement eledept;
	public MyLeadsPage enterdept(String dept) {
		type(eledept, dept);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_annualRevenue")
	private WebElement elervnu;
	public MyLeadsPage enterrvnu(String rvnu) {
		type(elervnu, rvnu);
		return this;
		
	}
	@FindBy(how=How.ID,using="createLeadForm_currencyUomId")
	private WebElement elecUomId;
	public MyLeadsPage selectCurrency(String cUomId) {
		selectDropDownUsingIndex(elecUomId, Integer.parseInt(cUomId));
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_industryEnumId")
	private WebElement eleiEnumId;
	public MyLeadsPage selectindustry(String iEnumId) {
		selectDropDownUsingIndex(eleiEnumId, Integer.parseInt(iEnumId));
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_numberEmployees")
	private WebElement eleemp;
	public MyLeadsPage enteremployee(String emp) {
		type(eleemp, emp);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_ownershipEnumId")
	private WebElement eleoEnumId;
	public MyLeadsPage selectowner(String oEnumId) {
		selectDropDownUsingIndex(eleoEnumId, Integer.parseInt(oEnumId));
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_sicCode")
	private WebElement elesicCode;
	public MyLeadsPage entersicCode(String sicCode) {
		type(elesicCode, sicCode);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_tickerSymbol")
	private WebElement eletSym;
	public MyLeadsPage entertSymbol(String tSymbol) {
		type(eletSym, tSymbol);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_description")
	private WebElement eledesc;
	public MyLeadsPage enterdesc(String desc) {
		type(eledesc, desc);
		return this;
		
	}
	@FindBy(how=How.ID,using="createLeadForm_importantNote")
	private WebElement eleiNote;
	public MyLeadsPage enterinote(String iNote) {
		type(eleiNote, iNote);
		return this;
		
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneAreaCode")
	private WebElement elearea;
	public MyLeadsPage enterareacode(String area) {
		type(elearea, area);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elephone;
	public MyLeadsPage enterphone(String phone) {
		type(elephone, phone);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneExtension")
	private WebElement eleextn;
	public MyLeadsPage enterextn(String extn) {
		type(eleextn, extn);
		return this;
		
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneAskForName")
	private WebElement eleaskname;
	public MyLeadsPage enteraskname(String askname) {
		type(eleaskname, askname);
		return this;
		
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEmail;
	public MyLeadsPage enterEmail(String Email) {
		type(eleEmail, Email);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryWebUrl")
	private WebElement elewebUrl;
	public MyLeadsPage enterweburl(String webUrl) {
		type(elewebUrl, webUrl);
		return this;
		
	}
	@FindBy(how=How.ID,using="createLeadForm_generalToName")
	private WebElement eletoname;
	public MyLeadsPage entertoname(String toname) {
		type(eletoname, toname);
		return this;
		
	}
	@FindBy(how=How.ID,using="createLeadForm_generalAttnName")
	private WebElement eleattnName;
	public MyLeadsPage enterattnName(String attnName) {
		type(eleattnName, attnName);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="(//input[contains(@name,'generalAddress')])[1]")
	private WebElement eleaddress1;
	public MyLeadsPage enteraddress1(String address1) {
		type(eleaddress1, address1);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="(//input[contains(@name,'generalAddress')])[2]")
	private WebElement eleaddress2;
	public MyLeadsPage enteraddress2(String address2) {
		type(eleaddress2, address2);
		return this;
		
	}
	@FindBy(how=How.ID,using="createLeadForm_generalCountryGeoId")
	private WebElement eleCountryId;
	public MyLeadsPage selectCountryId(String CountryId) {
		selectDropDownUsingText(eleCountryId, CountryId);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_generalStateProvinceGeoId")
	private WebElement eleState;
	public MyLeadsPage selectState(String State) {
		selectDropDownUsingText(eleState, State);
		return this;
		
	}
	@FindBy(how=How.ID,using="createLeadForm_generalPostalCode")
	private WebElement elepostcode;
	public MyLeadsPage enterpostcode(String postcode) {
		type(elepostcode, postcode);
		return this;
		
	}
	@FindBy(how=How.ID,using="createLeadForm_generalCity")
	private WebElement elecity;
	public MyLeadsPage entercity(String city) {
		type(elecity, city);
		return this;
		
	}
	@FindBy(how=How.ID,using="createLeadForm_generalPostalCodeExt")
	private WebElement elepstextn;
	public MyLeadsPage enterpstextn(String pstextn) {
		type(elepstextn, pstextn);
		return this;
		
	}
		
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement findlead;
	public FindLead clickFindlead() {
		click(findlead);
		return new FindLead(driver,test);
	}
	
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement submitbtn;
	public ViewLeadPage clickSubBtn() {
		click(submitbtn);
		return new ViewLeadPage(driver,test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement elemergelead;
	public MergeLeadPage clickMergelead() {
		click(elemergelead);
		return new MergeLeadPage(driver,test);
	}
	
	
	
	
	
	
	
	
	
}

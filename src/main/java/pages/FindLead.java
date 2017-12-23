package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLead extends ProjectMethods{
	String leadno;	
	public FindLead(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
			
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement elefname;
	public FindLead enterfirstname(String fName) {
		type(elefname, fName);
		return this;
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Email")
	private WebElement eleclkemail;
	public FindLead clickemail() {
		click(eleclkemail);
		return this;
		
	}
	
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement eleemail;
	public FindLead enteremail(String email) {
		type(eleemail, email);
		return this;
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Phone")
	private WebElement eleclkphone;
	public FindLead clickphone() {
		click(eleclkphone);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement elephone;
	public FindLead enterphoneno(String phone) {
		type(elephone, phone);
		return this;
		
	}
	
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement elefindleadbtn;
	public FindLead clickFindleadBtn() {
		click(elefindleadbtn);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[contains(@class,'x-grid3-col-partyId')]/a")
	private WebElement elefirstresult;
	public ViewLeadPage clickFirstResult() {
		leadno=getText(elefirstresult);
		click(elefirstresult);
		return new ViewLeadPage(driver, test);
	}
	@FindBy(how=How.NAME,using="id")
	private WebElement elelead;
	public FindLead enterlead(String lead) {
		type(elelead,lead);
		return this;
		
	}
	@FindBy(how=How.CLASS_NAME,using="x-paging-info")
	private WebElement elevtext;
	public FindLead Verifytext() {
		verifyDisplayed(elevtext);
		return this;
	}
	
		
}

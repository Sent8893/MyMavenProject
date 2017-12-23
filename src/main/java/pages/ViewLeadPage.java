package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement Vlead;
	public ViewLeadPage VerifyName(String expectedText) {
		verifyPartialText(Vlead, expectedText);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleedit;
	public EditLeadPage clickEdit() {
		click(eleedit);
		return new EditLeadPage(driver, test);
	}	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement elevcName;
	public ViewLeadPage VerifyComp(String expectedText) {
		verifyPartialText(elevcName, expectedText);
		return this;
	}
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement elevfName;
	public ViewLeadPage Verifyname(String expectedText) {
		verifyExactText(elevfName, expectedText);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eledup;
	public DuplicateLeadPage clickduplicate() {
		click(eledup);
		return new DuplicateLeadPage(driver, test);
	}
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eledelete;
	public MyLeadsPage clickdelete() {
		click(eledelete);
		return new MyLeadsPage(driver, test);
	}
	
	
	

}

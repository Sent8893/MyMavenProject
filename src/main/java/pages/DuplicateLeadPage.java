package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods{
	
	public DuplicateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.ID,using="sectionHeaderTitle_leads")
	private WebElement elevName;
	public DuplicateLeadPage VerifyTitle() {
		verifyDisplayed(elevName);
		return this;
	}
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement elesubmit;
	public ViewLeadPage clickcreate() {
		click(elesubmit);
		return new ViewLeadPage(driver,test);
	}
	
	
	
	
	

}

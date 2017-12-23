package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{
	
	public MergeLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(@href,'partyIdFrom')]")
	private WebElement eleclickfromlead;
	public FindLead clickfromlead() {
		click(eleclickfromlead);
		switchToWindow(1);
		return new FindLead(driver,test);		
	}
		
	
	
	

}

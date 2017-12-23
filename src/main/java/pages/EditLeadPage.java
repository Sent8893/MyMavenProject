package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{
	
	public EditLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement elecName;
	public EditLeadPage entercompname(String cname) {
		type(elecName, cname);
		return this;
		
	}
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleupdate;
	public ViewLeadPage clickUpdate() {
		click(eleupdate);
		return new ViewLeadPage(driver,test);
	}
	
	
	
	
	

}

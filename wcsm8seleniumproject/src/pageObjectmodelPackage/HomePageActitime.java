package pageObjectmodelPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageActitime {

	// declare with @FindBy annotation
	@FindBy(xpath = "//A[@class='content users_selected selected']/DIV[2]/IMG") private WebElement usersTab;
	@FindBy(xpath = "//*[@name='username']") private WebElement usenameTB;
	@FindBy(xpath = "//*[@name='passwordText']") private WebElement passwordTB;
	@FindBy(xpath = "//*[@name='passwordTextRetype']") private WebElement retypepasswordTB;
	@FindBy(xpath = "//*[@name='firstName']") private WebElement firstnameTB;
	@FindBy(xpath = "//*[@name='lastName']") private WebElement lastnameTB;
	@FindBy(xpath = "//input[@type='submit']") private WebElement createuserBTN;
	
public HomePageActitime)
	//utilization
	public WebElement getUsersTab() {
		return usersTab;
	}
	public WebElement getUsenameTB() {
		return usenameTB;
	}
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	public WebElement getRetypepasswordTB() {
		return retypepasswordTB;
	}
	public WebElement getFirstnameTB() {
		return firstnameTB;
	}
	public WebElement getLastnameTB() {
		return lastnameTB;
	}
	public WebElement getCreateuserBTN() {
		return createuserBTN;
	}
	
	
}

package pageObjectmodelPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class HomepageActitime extends BaseTest {

	// declare with @FindBy annotation
	@FindBy(xpath = "//a[@class='content tasks']/img[@class='sizer']") private WebElement usersTab;
	@FindBy(xpath="//input[@value='Create New User']")private WebElement createnewuserbtn;
	@FindBy(xpath = "//*[@name='username']") private WebElement usernameTB;
	@FindBy(xpath = "//*[@name='passwordText']") private WebElement passwordTB;
	@FindBy(xpath = "//*[@name='passwordTextRetype']") private WebElement retypepasswordTB;
	@FindBy(xpath = "//*[@name='firstName']") private WebElement firstnameTB;
	@FindBy(xpath = "//*[@name='lastName']") private WebElement lastnameTB;
	@FindBy(xpath = "//input[@value='   Create User   ']") private WebElement createuserBTN;
	@FindBy(xpath="//a[text()='Devkar, Sachin (TestEng)']")private WebElement usercreated;
	@FindBy(xpath="//input[@value='Delete This User']")private WebElement deleteuser;
	
	
	
public HomepageActitime(WebDriver driver)
{
	PageFactory.initElements( driver ,this);
	}

	//utilization
public WebElement getUsersTab() {
	return usersTab;
}

public WebElement getCreatenewuserbtn() {
	return createnewuserbtn;
}

public WebElement getUsernameTB() {
	return usernameTB;
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

public WebElement getUsercreated() {
	return usercreated;
}

public WebElement getDeleteuser() {
	return deleteuser;
}
	
	
	//operational methods

	public void createUser() throws EncryptedDocumentException, IOException
	{
		usersTab.click();
		createnewuserbtn.click();
		Flib flib = new Flib();
		usernameTB.sendKeys(flib.readExcelData(EXCEL_PATH, "createuser", 1, 0));
		passwordTB.sendKeys(flib.readExcelData(EXCEL_PATH, "createuser", 1, 1));
	    retypepasswordTB.sendKeys(flib.readExcelData(EXCEL_PATH, "createuser", 1, 2));
        firstnameTB.sendKeys(flib.readExcelData(EXCEL_PATH, "createuser", 1, 3));
        lastnameTB.sendKeys(flib.readExcelData(EXCEL_PATH, "createuser", 1, 4));
        createuserBTN.click();
        
	}
	public void deleteuser() throws InterruptedException 
	{
		usercreated.click();
	    deleteuser.click();
	    Thread.sleep(2000);
	   
	   Alert alert = driver.switchTo().alert();
	   alert.accept();
	    Thread.sleep(2000);
	}

	
	
	
	
}

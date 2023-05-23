package pageObjectmodelPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskTabActitime extends BaseTest {
	

	@FindBy(xpath = "//a[@class='content tasks']/img[@class='sizer']") private WebElement Taskbtn;
	@FindBy(xpath="//input[@value='Create New Tasks']")private WebElement createnewtaskbtn;
	@FindBy(xpath = "//select[@name='customerId']") private WebElement firstDropdown;
	@FindBy(xpath = "//*[@name='projectId']") private WebElement secondDropdown;
	@FindBy(xpath = "//TD[@id='task0.cell']/INPUT[@class='text']") private WebElement tasknameTF;
	@FindBy(xpath = "//input[@onclick='createTasks();']") private WebElement createtaskbtn;
	@FindBy(xpath = "//a[.='test case executed']")private WebElement testexicutedlink;
	@FindBy(xpath = "//input[@value='Delete This Task']")private WebElement deletebtn;
	@FindBy(xpath = "//input[@value='Delete Task']")private WebElement deleteTask;
	
	
	public TaskTabActitime(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getTaskbtn() {
		return Taskbtn;
	}
	public WebElement getCreatenewtaskbtn() {
		return createnewtaskbtn;
	}
	public WebElement getFirstDropdown() {
		return firstDropdown;
	}
	public WebElement getSecondDropdown() {
		return secondDropdown;
	}
	public WebElement getTasknameTF() {
		return tasknameTF;
	}
	public WebElement getCreatetaskbtn() {
		return createtaskbtn;
	}
	public WebElement getTestexicutedlink() {
		return testexicutedlink;
	}
	public WebElement getDeletebtn() {
		return deletebtn;
	}
	public void createtask() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Taskbtn.click();
		createnewtaskbtn.click();
		 Select sel = new Select(firstDropdown);
		 sel.selectByVisibleText("ICICI BANK");
		 Select sel2 = new Select(secondDropdown);
		 sel2.selectByVisibleText("mobile application");
		 Flib flib = new Flib();
		 tasknameTF.sendKeys(readExcelData(EXCEL_PATH, "Taskname", 1, 0));
		 createtaskbtn.click();
		 Thread.sleep(2000);
		 
	}
	public void deleteTask()
	{
		testexicutedlink.click();
		deletebtn.click();
		 Alert alert = driver.switchTo().alert();
		   alert.accept();
		
	}
	
	
	
	
	
}

package dataDrivenpackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-pe8q2fd/login.jsp");
	
	// to read the data from external files create the obj of flib 
	
	Flib flib = new Flib();
	int rc = flib.rowCount("./data/ActitimeData.xlsx","invalidcreds");
	for(int i=1;i<=rc;i++)
	{
	String invalidUsername = flib.readExcelData("./data/ActitimeData.xlsx","invalidcreds",i,0);
    String invalidPassword = flib.readExcelData("./data/ActitimeData.xlsx","invalidcreds",i, 1);

    driver.findElement(By.name("username")).sendKeys(invalidUsername);
    driver.findElement(By.name("pwd")).sendKeys(invalidPassword);
    Thread.sleep(2000);
    driver.findElement(By.id("loginButton")).click();
    Thread.sleep(2000);

    driver.findElement(By.name("username")).clear();
}
}
}

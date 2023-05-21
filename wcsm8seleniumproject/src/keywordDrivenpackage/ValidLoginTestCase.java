package keywordDrivenpackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
	    Flib flib = new	Flib();
	    Thread.sleep(2000);
	
	String username = flib.readPropertyData(PROP_PATH, "username");
	String password = flib.readPropertyData(PROP_PATH, "password");
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.id("loginButton")).click();
	
	}
}

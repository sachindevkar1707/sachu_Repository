package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchfirefoxbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        //to avoid the illegalstateException
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
	
		driver.manage().window().maximize();//maximize the window
		Thread.sleep(2000);//stop the execution for 2 sec
		
		//to close the firefox browser
		driver.close();
		
	}

}

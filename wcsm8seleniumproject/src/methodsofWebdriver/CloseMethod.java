package methodsofWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	ChromeOptions	co=new ChromeOptions();
	
	co.addArguments("--remote-allow-origins=*");
	
	WebDriver driver =new ChromeDriver(co);
	driver.manage().window().maximize();//maximize the window
	
	driver.get("http://omayo.blogspot.com/");
	
	Thread.sleep(2000);//stop the exicution of the script for the 2sec
	driver.close();//to close the browser
		
	}

}

package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class LaunchChromebrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//to avoid illegal exception

   ChromeOptions co =new ChromeOptions();//to avoid the connectionFailedException
   
   co.addArguments("--remote-allow-origins=*");
		
		//to launch the chromebrowser
		ChromeDriver driver = new ChromeDriver(co);
		
		
		//to maximise browser
		driver.manage().window().maximize();	
		
		Thread.sleep(2000);//stop the execution of the script for 2sec
		
		
		//to close chrome browser
		driver.close();
	}

}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XPath {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions co =new ChromeOptions();
	 co.addArguments("--remote-allow-origins=*");
	 
	 WebDriver driver = new ChromeDriver(co);
	 driver.manage().window().maximize();
	 driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@placeholder='Your Full Name*']")).sendKeys("sachin");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@placeholder='Business Email*']")).sendKeys("devkarsachin55@gmail.com");
	 driver.findElement(By.xpath("//input[@placeholder='Phone Number*']")).sendKeys("8408098266");
	 driver.findElement(By.xpath("//input[@placeholder='Type your favored name here...']")).sendKeys("Sachindevkar");	 
	 
}
}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Namelocator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions co =new ChromeOptions();
	 co.addArguments("--remote-allow-origins=*");
	 
	 WebDriver driver = new ChromeDriver(co);
	 driver.manage().window().maximize();
	 driver.get("http://desktop-pe8q2fd/login.do");
	 Thread.sleep(2000);
	 driver.findElement(By.name("username")).sendKeys("admin");
	 Thread.sleep(2000);
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 driver.findElement(By.id("loginbutton")).click();
	 
	 
}
}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 
		 WebDriver driver = new ChromeDriver(co);
		 driver.manage().window().maximize();
		 driver.get("https://www.my11circle.com/player/login.html#login");
		 driver.findElement(By.xpath("//input[@placeholder='Email ID / Username']")).sendKeys("devkarsachin");
	}
}

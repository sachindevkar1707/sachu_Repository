package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignments1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeOptions co =new ChromeOptions();
	 co.addArguments("--remote-allow-origins=*");
	 
	 WebDriver driver = new ChromeDriver(co);
	 driver.manage().window().maximize();
	 driver.get("https://www.netflix.com/in/login");
	 
	 driver.findElement(By.id("id_userLoginId")).sendKeys("abcd@1234");
	 driver.findElement(By.id("id_password")).sendKeys("1234abcd");
	 driver.findElement(By.xpath("//button[text()='Sign In']")).click();
}
}

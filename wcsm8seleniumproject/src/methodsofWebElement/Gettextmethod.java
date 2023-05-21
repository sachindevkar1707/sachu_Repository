package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextmethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://desktop-pe8q2fd/login.do");
	   WebElement userNameTB = driver.findElement(By.name("username"));
	   
	    WebElement passwordTB = driver.findElement(By.name("pwd"));
	    userNameTB.sendKeys("admin");
	    passwordTB.sendKeys("manager");
	    String button = driver.findElement(By.xpath("//input[contains(@name,username)]")).getText();
	    System.out.println(button);
}
}

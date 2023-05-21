package readExceldata;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validcreds {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://desktop-pe8q2fd/login.do");
	    driver.findElement(By.name("username")).sendKeys(validUsername);
	    driver.findElement(By.name("pwd")).sendKeys(validpassword);
	    driver.findElement(By.id("loginButton")).click();
	    Thread.sleep(3000);
	    
	    
}
}

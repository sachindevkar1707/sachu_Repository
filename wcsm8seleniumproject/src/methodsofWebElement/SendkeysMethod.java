package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get("http://desktop-pe8q2fd/login.do");
		    driver.findElement(By.name("username")).sendKeys("admin123");
		    driver.findElement(By.name("pwd")).sendKeys("manager123");
		    Thread.sleep(2000);
		    driver.navigate().refresh();
		    driver.findElement(By.name("username")).sendKeys("manager123");
		    driver.findElement(By.name("pwd")).sendKeys("admin123");
		    
	}
}

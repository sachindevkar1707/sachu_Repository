package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedmethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.netflix.com/in/login");
		WebElement userN = driver.findElement(By.name("userLoginId"));
		WebElement passW = driver.findElement(By.name("password"));
		WebElement button = driver.findElement(By.xpath("//button[text()='Sign In']"));

		boolean c = userN.isDisplayed();
		System.out.println(c);
		if(userN.isDisplayed())
		{
			userN.sendKeys("sachin@123");
		}
		else
		{
			System.out.println("will get exception"); 
		}
		if(passW.isDisplayed())
		{
			passW.sendKeys("sachu@123");
		}
		else
		{
			System.out.println("will get exception"); 
		}
		if(button.isDisplayed())
		{
			button.click();
		}
		else
		{
			System.out.println("will get exception"); 
		}
	}
}

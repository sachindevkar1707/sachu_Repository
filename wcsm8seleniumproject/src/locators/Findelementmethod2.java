package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelementmethod2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   // ChromeOptions co= new ChromeOptions();
	   // co.addArguments("--remote-allow-origins=*");
	    
	    WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    driver.switchTo().activeElement().sendKeys("mobile");
	    Thread.sleep(2000);
	    List<WebElement> pohaOptions =driver.findElements(By.xpath("//div[@class='_3704LK']"));
	    
	    for(int i=0;i<=pohaOptions.size();i++)
	   {
	    	String poha = pohaOptions.get(i).getText();
	   	    System.out.println(poha);
	    	Thread.sleep(2000);
	   }
	}
}

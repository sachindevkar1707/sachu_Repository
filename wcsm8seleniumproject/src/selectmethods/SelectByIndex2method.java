package selectmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex2method {
public static void main(String[] args) throws InterruptedException 
//multi select dropdown
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("file:///C:/Users/Dell/Documents/multipleselectdropdown.html");
	    WebElement dropDown = driver.findElement(By.id("i1"));
	  Select sel = new Select(dropDown);
	   //select multiple  options
	  for(int i=0;i<7;i++)
	  {
		 
		sel.selectByIndex(i);
		Thread.sleep(2000);
	  }
}
}

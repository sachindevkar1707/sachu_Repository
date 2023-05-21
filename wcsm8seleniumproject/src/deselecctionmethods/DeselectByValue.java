package deselecctionmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValue {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("file:///C:/Users/Dell/Documents/multipleselectdropdown.html");
	    WebElement dropDown = driver.findElement(By.name("n1"));
	   Select sel = new Select(dropDown);
	   Thread.sleep(2000);
	   sel.selectByVisibleText("Vadapav");
	   Thread.sleep(2000);
	   sel.deselectByVisibleText("Vadapav");
}
}

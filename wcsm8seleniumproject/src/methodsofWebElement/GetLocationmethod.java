package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationmethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.orangehrm.com/en/orangehrm-30-day-trial");
	   WebElement button = driver.findElement(By.xpath("//input[@class='action']"));
	  Point loc = button.getLocation();
	 int xaxis = loc.getX();
	 int yaxis = loc.getY();
	 System.out.println("x axis:"+xaxis+"y axis:"+yaxis);
}
}

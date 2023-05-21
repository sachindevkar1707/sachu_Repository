package methodsofWebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowHandle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://omayo.blogspot.com/");
	WebElement link = driver.findElement(By.linkText("Open a popup window"));
	Point point = link.getLocation();
	int xaxis = point.getX();
	int yaxis = point.getY();
	Thread.sleep(2000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-250)+")");
	Thread.sleep(2000);
	String parenthandle = driver.getWindowHandle();
	System.out.println("handle aparent window:"+parenthandle);
	link.click();
	Set<String> allHandles = driver.getWindowHandles();
	for(String wh:allHandles)
	{
	   System.out.println(wh);
	}
	 
	
}
}

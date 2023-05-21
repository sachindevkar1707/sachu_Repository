package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {
public static void main(String[] args) throws InterruptedException {
	//perform max action on the child window
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
	//address of the parent window
	String parentHandle = driver.getWindowHandle();
	
	
	//click on the link for child window
	link.click();
	//adress of the parent&child window
	Set<String> allHandles = driver.getWindowHandles();
	//maximize child window
	for(String wh:allHandles)
	{
		if(!parentHandle.equals(wh));

	}
	
	
	
	
}
}

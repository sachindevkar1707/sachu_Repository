package deselecctionmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndex {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("file:///C:/Users/Dell/Documents/multipleselectdropdown.html");
	    WebElement dropDown = driver.findElement(By.id("i1"));
	   Select sel = new Select(dropDown);
	   //select multiple  options
	  for(int i=0;i<8;i++)
	  {
		 if(i%2==0)
		 {
		sel.selectByIndex(i);
		Thread.sleep(2000);
		 }
		 else
		 {
			 System.out.println("its odd place");
		 }
	  }
	  //deselect the options
	  for(int i=0;i<8;i++)
	  {
		  if(i%2==0)
		  {
			  Thread.sleep(2000);
			  sel.deselectByIndex(i);
		  }
		  else
		  {
			  System.out.println("its odd place");  
		  }
	  }
}
}

package eliminateDuplicates;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Dell/Documents/multipleselectdropdown.html");
	
	WebElement dropDown = driver.findElement(By.name("n1"));
	
   Select sel = new Select(dropDown);
   List<WebElement> allOptions = sel.getOptions();
   //to eliminate the duplicates
   TreeSet<String> ts = new TreeSet<String>();
   //to read the list by eliminating the duplicates 
   for(int i=0;i<allOptions.size();i++)
   {
	   //
	  String op = allOptions.get(i).getText();
	  //
	  ts.add(op);
   }
   //
   for(String options:ts)
   {
	   Thread.sleep(2000);
	   System.out.println(options);
   }
	   
}
}

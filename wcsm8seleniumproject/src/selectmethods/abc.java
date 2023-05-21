package selectmethods;

import java.time.Duration;
import java.util.List;

import javax.management.openmbean.OpenMBeanAttributeInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class abc {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		
		WebElement dropdown = driver.findElement(By.id("multiselect1"));
		
	   Select sel=new Select(dropdown);
	   sel.selectByIndex(3);
	  List<WebElement> allOptions = sel.getOptions();
	  
	  for(int i=0;i<allOptions.size();i++)
	  {
		  String option=allOptions.get(i).getText();
		  System.out.println(option);
	  }
	}

}

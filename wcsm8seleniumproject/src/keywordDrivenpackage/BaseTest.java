package keywordDrivenpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseTest extends Flib implements IAutoConstant{

	static WebDriver driver;
	
	public void openBrowser() throws IOException ,FileNotFoundException {
		Flib flib = new Flib();
		
		String browserValue=flib.readPropertyData(PROP_PATH, "browser");
		
		
		 String url = flib.readPropertyData(PROP_PATH, "url");
		 
		 
		 if(browserValue.equalsIgnoreCase("chrome"))
		 {
			 System.setProperty(CHROME_PATH,CHROME_KEY);
			  driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get(url);
				
				
				
		 }
		 else if(browserValue.equalsIgnoreCase("firefox"))
		 {
			 System.setProperty(GECKO_PATH,GECKO_KEY);
			  driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get(url);
		 }
		 else
		 {
			 System.out.println("invalid browser value");
		 }
		 
		
		 
		 
	}
	 public void closeBrowser() 
	 {
		 driver.quit();
	 }
	
}

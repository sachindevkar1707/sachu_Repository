package synchroniazation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitimetestcase1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		    
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    driver.get("http://desktop-pe8q2fd/login.do");
		    
		   String Loginpagetitle = driver.getTitle();
		   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		   
		   
	}
}

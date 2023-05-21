package methodsofWebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ManageSetSizemethod {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

	ChromeOptions co=new ChromeOptions();
	
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver =new ChromeDriver(co);
	driver.manage().window().maximize();
	
	Dimension targetsize =new Dimension(350,450);
	driver.manage().window().setSize(targetsize);
	
}
}

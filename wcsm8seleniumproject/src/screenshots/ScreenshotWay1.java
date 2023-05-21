package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotWay1 {
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.indiabix.com/");
	
	File ts =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screenshots/ss2.png");
	Files.copy(ts, dest);
	
	
	
	
	
}
}

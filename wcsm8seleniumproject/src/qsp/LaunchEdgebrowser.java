package qsp;




import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LaunchEdgebrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stu
		//System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");//to avoid illegal StateException
		//to aviod connectionfailedException
		EdgeOptions eo=new EdgeOptions();
		 eo.addArguments("--remote-allow-origins=*");
		//to launch edgebrowser
		 EdgeDriver driver=new EdgeDriver();
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);//to stop the exicution for the 2 sec
		 driver.close();
		 
		 
		
		
		
	}

}

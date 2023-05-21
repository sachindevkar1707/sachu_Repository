package locators;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpathflipkart {
  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    ChromeOptions co= new ChromeOptions();
    co.addArguments("--remote-allow-origins=*");
    
    WebDriver driver =new ChromeDriver(co);
    
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[text()='✕']")).click();
    driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("hp laptops");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[text()='Core i7' and (@class='_3879cV')]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[text()='Brand']")).click();
    driver.findElement(By.xpath("//div[text()='Type']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[text()='Gaming Laptop']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[text()='Operating System']")).click();
     String price = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[1]")).getText();
    System.out.println(price);
    Thread.sleep(1000);
  
    driver.quit();
  
    
    
  }
}
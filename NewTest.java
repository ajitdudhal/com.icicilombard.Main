package testNGprgrm1;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
  WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.icicilombard.com/");
	  Reporter.log("bmethod", true);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  System.out.println("done");
  }

}

package testNGprgrm1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 extends NewTest {
  @Test
  public void f() {
	  WebElement ele1= driver.findElement(By.xpath("//a[@href='#'][contains(text(),'Motor')]"));
	  WebElement ele2= driver.findElement(By.xpath("//a[@href='#'][contains(text(),'Motor')]"));
	  Actions act= new Actions(driver);
	  act.moveToElement(ele1).moveToElement(ele2).click().perform();
	 String str = driver.getTitle();
	 System.out.println(str);
	 Reporter.log(str, true);
	  
  }
}
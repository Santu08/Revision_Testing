package eCommercePrjt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lifestyle {
  @Test
  public void LifestyleTest() throws InterruptedException {
	  
	  
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.lifestylestores.com/");
	  //Assert.fail();
	  Thread.sleep(3000);
	  driver.close();
  }
}

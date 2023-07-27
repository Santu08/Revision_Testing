package eCommercePrjt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Jio {
  @Test
  public void JioTest() throws InterruptedException {
	  
	  
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.jio.com/");
	  //Assert.fail();
	  Thread.sleep(3000);
	  driver.close();
	  
  }
}

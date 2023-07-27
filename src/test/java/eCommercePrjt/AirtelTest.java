package eCommercePrjt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AirtelTest {
  @Test
  public void Airtel() throws InterruptedException {
	  
	  
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.airtel.com/");
	  //Assert.fail();
	  Thread.sleep(3000);
	  driver.close();
  }
}

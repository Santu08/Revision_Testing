package eCommercePrjt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VodaIdea {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
		  driver.get("https://www.myvi.in/");
		  //Assert.fail();
		  Thread.sleep(3000);
		  driver.close();
	}

}

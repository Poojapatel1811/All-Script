package TestNG;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG {
	
	WebDriver driver;	
  
  @BeforeTest
  public void hitURL() throws InterruptedException
  {
	  System.out.println("Launch browser mathod called");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\pooja.patel\\workspace\\Selenium\\Driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  Thread.sleep(5000);
	  
  }
  
  @Test
  public void verifyURL2() throws IOException, InterruptedException
  {
 	 Thread.sleep(4000);
 	 driver.get("https://www.google.com");
 	 String actualTitle = "Google"; // incorrect title
 	 Thread.sleep(2000);
 	 String msg = "Titles are not same";
 	 Assert.assertEquals(driver.getTitle(), actualTitle);
 	 Thread.sleep(4000);

  }
  
@Test
  public void VerifyURL() throws IOException, InterruptedException
  {
	 driver.get("https://www.gmail.com");
	 String actualTitle = "Gmail"; // correct title
	 Assert.assertEquals(driver.getTitle(), actualTitle);
	 Thread.sleep(4000);
  }

 
 @AfterTest
 public void terminate()
 {
	 driver.close();
 }
 
}
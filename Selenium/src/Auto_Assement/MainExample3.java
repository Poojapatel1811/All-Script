package Auto_Assement;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainExample3 extends Example3Methods {
	
	
	@BeforeSuite
	public void Applaunch() throws IOException 
	{
		//Objrep();
		Applaunch("Chrome","http://automationpractice.com/index.php");
		
	}
	
	@BeforeTest
	public void Btest()
	{
		System.out.println("All test started");
	}
	
	@Test(priority=0)
	public void Signin() throws IOException
	{
		//Ewait("signin");
		click("signin");	
	}
	
	@Test(priority=1)
	public void Excelread1() throws IOException
	{
		Excelread();
		sendkeys("email", email);
		sendkeys("pw", pswrd);
		click("Signin2");
		
	}
	
	@Test(priority=2)
	public void TshirtMenu() throws IOException, InterruptedException
	{
		click("Tmenu");
		
		//Scroll(0,750);
		mouse("image");
		Thread.sleep(2000);
		click("view");
		
		driver.switchTo().frame(driver.findElement(By.xpath(obj.getProperty("frame"))));
		Thread.sleep(2000);
		click("cart");
		Thread.sleep(2000);
		click("close");
		
		//driver.findElement(By.partialLinkText("Quick view")).click();
		/*click("list");
		click("Timg");
		Ewait("Tclose");
		click("Tclose");
		
		Thread.sleep(2000);
		click("atc");
			*/
	}
	
	@AfterTest
	public void Signout() throws IOException
	{
		click("signout");
	}
	
	@AfterSuite
	public void close()
	{
		driver.close();
		System.out.println("Test executed successfully");
	}
}

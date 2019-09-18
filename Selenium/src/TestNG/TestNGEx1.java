package TestNG;

import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGEx1 {
	WebDriver Driver;
	
	@BeforeSuite
	public void OpenURL() throws InterruptedException
	{
		System.out.println("Launch browser invoke successfully...");
		System.setProperty("webdriver.chrome.driver", "C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Thread.sleep(1000);
		}
	@BeforeTest
	public void BeforeAllTest()
	{
		System.out.println("First Test called...");
	}
	@BeforeMethod
	public void Mymethod()
	{
		System.out.println("Method Called Successfully...");
	}
	@Test
	public void FirstTest() throws InterruptedException
	{
		Thread.sleep(2000);
		Driver.get("https://www.google.com/");
		Driver.findElement(By.xpath("//input[@name='q']")).sendKeys("YouTube");
	}
	@Test
	public void SecondTest() throws InterruptedException
	{
		Actions act=new Actions(Driver);
		act.sendKeys(Keys.RETURN).perform();
		Driver.findElement(By.xpath("//div[text()='YouTube']")).click();
		
		String ActualTitle="YouTube";
		Assert.assertEquals(Driver.getTitle(), ActualTitle);
		Thread.sleep(2000);	
	}
	@AfterMethod
	public void AfterMymethod()
	{
		System.out.println("Method Close...");
	}
	@AfterTest
	public void EndTest() throws InterruptedException
	{
		System.out.println("All tests executed..");
	}
	@AfterSuite
	public void CloseChrome()
	{	
		System.out.println("Browser Closed");
		Driver.quit();
	}
}

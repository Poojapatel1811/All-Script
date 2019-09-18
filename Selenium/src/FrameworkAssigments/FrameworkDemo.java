package FrameworkAssigments;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameworkDemo {
	static WebDriver driver1;
	static Properties obj=new Properties();
	static FileInputStream file1;
	static Actions act;
	
	public static void OpenBr(String browser,String AppURL)
	{
		try {
			if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver","C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
				driver1 = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("FireFox")) {
				System.setProperty("webdriver.gecko.driver","C://Users//pooja.patel//workspace//Selenium//Driver1//geckodriver.exe");
				driver1 = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("IE")) {
				System.setProperty("Webdriver.IE.driver","C://Users//pooja.patel//workspace//Selenium//Driver2//IEDriverServer.exe");
				driver1 = new InternetExplorerDriver();
			} else {
				System.out.println("Browser is not Supported");
			}
			driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver1.manage().window().maximize();
			driver1.get(AppURL);
		} catch (Exception e) 
		{
			System.out.println("Browser launch successfully..."+e);
		}		
	}
	
	public static void Objectrep() throws IOException
	{	
		try {
			file1 = new FileInputStream(System.getProperty("user.dir") + "//Locators//ObjectRep.properties");
			obj.load(file1);
		} catch (Exception e) {
			System.out.println("Object repository exception"+e);
		}
	}
	
	public static void Ewait(String path) throws IOException
	{
		try {
			Objectrep();
			WebDriverWait wait = new WebDriverWait(driver1, 20);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(obj.getProperty(path))));
		} catch (Exception e) {
			System.out.println("Explicit wait Exception"+e);
		}
	}
	
	public static void Sendkeys(String object,String search) throws IOException
	{
		try {
			Ewait("search1");
			Objectrep();
			driver1.findElement(By.xpath(obj.getProperty(object))).sendKeys(search);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void click()
	{
	driver1.findElement(By.xpath(obj.getProperty("linkclick"))).click();
	}
	
	public static void quit()
	{
		driver1.quit();
	}
	public static void Event()
	{
		act=new Actions(driver1);
		act.sendKeys(Keys.RETURN).perform();	
	}
	
	public static void Event1()
	{
		act=new Actions(driver1);
		act.moveToElement(driver1.findElement(By.xpath(obj.getProperty("img")))).perform();
	}
	public static void Event2()
	{
		
	}
		
	
		
}
	
	
	

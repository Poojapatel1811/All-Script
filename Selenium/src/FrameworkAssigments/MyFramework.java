package FrameworkAssigments;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class MyFramework {
	static WebDriver driver;
	static Properties pro=new Properties();
	public static void OpenApp(String browser, String AppURL)
	{
		try
		{
			if(browser.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");		
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "C://Users//pooja.patel//workspace//Selenium//Driver1//geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.ie.driver", "C://Users//pooja.patel//workspace//Selenium//Driver2//IEDriverServer.exe");
				driver= new InternetExplorerDriver();
			}
			else
			{
				System.out.println("Browser is not supported");
			}
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(AppURL);
		}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
	}	

	public static void quitbrowser()
	{
	try
	{
		{
		driver.quit();
		}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());	
	}
}
	public static void objects() throws IOException
	{		
		 File file1=new File(System.getProperty("user.dir")+"//Locators//ObjectRep.properties");
		 FileInputStream file2=new FileInputStream(file1);
		 pro.load(file2);
	}
	public static void Sendkeys(String data) throws IOException
	{
		objects();
		driver.findElement(By.xpath(pro.getProperty("text"))).sendKeys(data);
	}	
}

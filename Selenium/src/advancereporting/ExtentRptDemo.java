package advancereporting;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentRptDemo {
	ExtentReports report=new ExtentReports(System.getProperty("user.dir")+"//ExtentResult1.html");
	ExtentTest Test;
	ExtentTest Test2;
	static WebDriver driver;
	
	static Date date1=new Date();
	static SimpleDateFormat date2=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		driver=new ChromeDriver();
		ExtentRptDemo e=new ExtentRptDemo();	
		e.Launchbrowser();
		e.VerifyTitle();
	}
	public void Launchbrowser() throws InterruptedException
	{
		Test=report.startTest("Browser Invoke");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/");
		Test.log(LogStatus.INFO,"Browser Invoke successfully..");
		report.endTest(Test);
	}	
	public void VerifyTitle() throws IOException
	{
		
		File screen1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(screen1, new File(System.getProperty("user.dir")+"//myss1"+date2.format(date1)+".png"));  
		
		try {
			report.loadConfig(new File("C://Users//pooja.patel//workspace//Selenium//extent-config.xml"));
		Test2=report.startTest("Verify Title");
		
		if(driver.getTitle().equals("Meet Guru99 - Free Training Tutorials & Video for IT Courses"))
		{
			Test2.log(LogStatus.PASS,Test2.addScreenCapture(System.getProperty("user.dir")+"//myss1"+date2.format(date1)+".png")+"Test Successful");
			System.out.println("Test Pass");
		}
		else
		{
			Test2.log(LogStatus.FAIL,"Test Failed");
			System.out.println("Test Fail");
		}
		report.endTest(Test2);
		report.flush();
		
		

		} catch (Exception e) {
			System.out.println(e);
		}
		
		}
	
	
	
}

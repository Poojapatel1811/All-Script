package advancereporting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

  
public class ExtendRpt {
	ExtentReports report = new ExtentReports(System.getProperty("user.dir")+"//result.html");
	ExtentTest test ;
	WebDriver driver=new ChromeDriver();
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		
		ExtendRpt e=new ExtendRpt();
		e.launch();
		e.createemail();
		e.login(); 
		e.verify();		 
	}
		public void launch()
		{
		test=report.startTest("launch browser");
		test.log(LogStatus.INFO, "launch succesfully");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		}
		
		public void createemail() throws IOException
		{
			Properties obj=new Properties();																												
			FileInputStream objfile= new FileInputStream("C://Users//pooja.patel//workspace//Selenium//Locators//object1.properties");
			obj.load(objfile);
			
			test=report.startTest("Create Email");
			test.log(LogStatus.INFO, "Create mail successfully");
		
		driver.findElement(By.xpath(obj.getProperty("fname"))).sendKeys("Pooja");
		driver.findElement(By.xpath(obj.getProperty("lname"))).sendKeys("Patel");
		driver.findElement(By.xpath(obj.getProperty("emailid"))).sendKeys("pjpatel181195");
		
		driver.findElement(By.xpath(obj.getProperty("paswrd"))).sendKeys("pjpatel12345");
		driver.findElement(By.xpath(obj.getProperty("cnfrm_pswrd"))).sendKeys("pjpatel12345");
		
		//driver.findElement(By.xpath(obj.getProperty("next"))).click();
		}
		
		public void login() throws InterruptedException, IOException 		{
			 report.loadConfig(new File("C://Users//pooja.patel//workspace//Selenium//extent-config.xml"));
			 test = report.startTest("demo");
		
			driver.navigate().to("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pjpatel181195@gmail.com");
			
			driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("pjpatel12345");
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(2000);
			
			
			Date date1 = new Date();
			SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy_MM_dd_HH_MM_ss");
			
			File ssFile1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileHandler.copy(ssFile1, new File("C:\\POOJA\\Screenshots\\ss2"+dateFormat2.format(date1)
			 +".png"));
			

			if(driver.getTitle().equals("Google Account"))
			{
				test.log(LogStatus.PASS, "Test Successfull");
				System.out.println("test pass");
			}
			else 
			{
				test.log(LogStatus.FAIL, "Test Not Successfull");
				System.out.println("test fail");
			}
			report.endTest(test);
			report.flush();
			
		}
		public void verify()
		{
			test=report.startTest("Verify url");
			test.log(LogStatus.INFO, "Url is verified");
			
			//driver.getCurrentUrl().equals("https://myaccount.google.com/?pli=1");
			String expected_url = "https://myaccount.google.com/?pli=1";
			
			try {
				Assert.assertEquals(expected_url, driver.getCurrentUrl());
				System.out.println("assert done");
				test.log(LogStatus.PASS, "test passed");
			} catch (Error e) {
				// TODO: handle exception
				test.log(LogStatus.FAIL, "test passed");
				
			}
			
			/*if(driver.getCurrentUrl().equals("https://myaccount.google.com/?pli=1"))
					{
						test.log(LogStatus.PASS,"Url is verified Successfully");
						System.out.println("Url is verified");
					}
			else
			{		
				test.log(LogStatus.FAIL,"Url is not verified");
				System.out.println("Url is wrong");
			}*/
		}
	}



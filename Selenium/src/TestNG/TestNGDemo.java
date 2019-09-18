package TestNG;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import FrameworkAssigments.FrameworkDemo;
public class TestNGDemo extends FrameworkDemo{
	WebDriver Driver;
	Properties obj=new Properties();
	WebDriver Ewait;	
	String date;
	 
	
	@BeforeSuite
	public void BrowserInvoke() throws InterruptedException, IOException
	{
		/*System.setProperty("webdriver.chrome.driver", "C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		
		FileInputStream obj1=new FileInputStream(System.getProperty("user.dir")+"//TestNG.properties");
		obj.load(obj1);*/
		OpenBr("Chrome", "https://www.youtube.com/");
		
	}
	
	@BeforeTest
	public void OpenURL() throws InterruptedException
	{
		Driver.get("http://demo.automationtesting.in/Index.html");
		Driver.findElement(By.xpath(obj.getProperty("Email"))).sendKeys("poojapatel1811@gmail.com");
		Driver.findElement(By.xpath(obj.getProperty("Click"))).click();
		Thread.sleep(2000);
	}
	@BeforeMethod
	public void BeforeMyMethod()
	{
		System.out.println("Method called Successfully...");
	}
	
	/*public void EWait(String Path)
	{
		WebDriverWait Wait=new WebDriverWait(Driver,30);
		Wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(obj.getProperty(Path))));
	}*/
	
	@Test(priority=0)
	public void FirstTest()
	{
		try {
			Driver.findElement(By.xpath(obj.getProperty("fname"))).sendKeys("Pooja");
			Driver.findElement(By.xpath(obj.getProperty("lname"))).sendKeys("Patel");
			Driver.findElement(By.xpath(obj.getProperty("Address"))).sendKeys("801,Moti vankad,Nani Daman,Daman-396210");
			Driver.findElement(By.xpath(obj.getProperty("Emailid"))).sendKeys("poojapatel1811@gmail.com");
			Driver.findElement(By.xpath(obj.getProperty("Phone"))).sendKeys("7689265446");
			Driver.findElement(By.xpath(obj.getProperty("Gender"))).click();
			
			//Ewait("chkbx");
			
			/*List<WebElement>abc1=Driver.findElements(By.xpath(obj.getProperty("chkbx")));
			String value="Cricket,Hockey,";
			
			List<String>list= new ArrayList<String>(Arrays.asList(value.split(",")));
			System.out.println(list);
			
			for(String check:list)
			{
				for(WebElement chk:abc1)
				{
					if(chk.getAttribute("value").equalsIgnoreCase(check));
					{
						chk.click();
						Thread.sleep(2000);
					}
		
				}
			}*/
			
			List<WebElement> abc1 = Driver.findElements(By.xpath(obj.getProperty("chkbx")));
			String value="Cricket,Hockey,";
			List<String> list = new ArrayList<String>(Arrays.asList(value.split(",")));
			System.out.println(list); 
			 for (String check : list)
			 { 
			 for (WebElement chk : abc1)
			 {
			 
				 if(chk.getAttribute("value").equalsIgnoreCase(check))
				 {
					 chk.click();
					 Thread.sleep(1000);
				 }
			 }
			
			 }
		}
		 catch (Exception e) 
		{
			System.out.println("First Test Exception..."+e);
		}
	}
	
	@Test(priority=1)
	public void SecondTest() throws InterruptedException
	{	
		try {
		Ewait("lang");
		System.out.println("This is selected");
		Driver.findElement(By.xpath(obj.getProperty("lang"))).click();
		Driver.findElement(By.xpath(obj.getProperty("langop"))).click();
		
		} catch (Exception e) {
			System.out.println("Exception in lang field"+e);
		}

	}
	
	@Test(priority=2)
	public void ThirdTest() throws InterruptedException
	{
		try {
		Ewait("Skill");
		Select dr1=new Select(Driver.findElement(By.xpath(obj.getProperty("Skill"))));
		dr1.selectByIndex(4);
		Thread.sleep(2000);
	
		} catch (Exception e) {
			System.out.println("Exception in Skill DD List"+e);
		}
	}
	
	@Test(priority=3)
	public void FourthTest() throws InterruptedException
	{
		try {
			Ewait("Country");
			Select dr2 = new Select(Driver.findElement(By.xpath(obj.getProperty("Country"))));
			dr2.selectByVisibleText("India");
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Exception in country DD list"+e);
		}
	}
	
	@Test(priority=4)
	public void FifthTest() throws InterruptedException, IOException
	{
		Ewait("SelCountry");
		
		try {
			Driver.findElement(By.xpath(obj.getProperty("SelCountry"))).click();
			Driver.findElement(By.xpath(obj.getProperty("cntry"))).click();		
		} catch (Exception e) {
			System.out.println("Exception in Select Country DD list"+e);
		}
	}
	
	@Test(priority=5)
	public void SixthTest()
	{
		try {
		Ewait("yr");
		Select dr3=new Select(Driver.findElement(By.xpath((obj.getProperty("yr")))));
		dr3.selectByVisibleText("1995");
		
		} catch (Exception e) {
			System.out.println("Exception in Year DD list"+e);
		}
	}
	
	@Test(priority=6)
	public void SeventhTest()
	{
		try {
			Ewait("mnth");
			Select dr4 = new Select(Driver.findElement(By.xpath(obj.getProperty("mnth"))));
			dr4.selectByVisibleText("November");
		} catch (Exception e) {
			System.out.println("Exception in mnth DD list"+e);
		}
	}
	
	
	@Test(priority=7)
	public void EightTest()
	{
		try {
			Ewait("day");
			Select dr4 = new Select(Driver.findElement(By.xpath(obj.getProperty("day"))));
			dr4.selectByVisibleText("18");
		} catch (Exception e) {
			System.out.println("Exception in Day DD list"+e);
		}
	}
	
	@Test(priority=8)
	public void NinthTest()
	{
		try {
			Ewait("pswrd");
			Driver.findElement(By.xpath(obj.getProperty("pswrd"))).sendKeys("Poojapatel123");
			
		} catch (Exception e) {
			System.out.println("Exception in password field"+e);
		}
	}
	
	@Test(priority=9)
	public void TenthTest()
	{
		try {
			Ewait("cnfrmpswrd");
			Driver.findElement(By.xpath(obj.getProperty("cnfrmpswrd"))).sendKeys("Poojapatel123");
		} catch (Exception e) 
		{
			System.out.println("Exception in Confirm password field"+e);
		}
		
	}
	
	@Test(priority=10)
	public void ElevenTest() throws IOException, InterruptedException
	{	
		//EWait("file");
		Driver.findElement(By.xpath(obj.getProperty("file"))).click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C://POOJA//AutoIT//FileuploadDemo1.exe");
	}
	
	public void ss() throws IOException, InterruptedException
	{	
		date = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		File ss=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File("C:\\POOJA\\Screenshots\\ss4_"+date+"_.png"));		
	}
	
	@Test(priority=11)
	public void TwelthTest() throws IOException, InterruptedException
	{
		try {
			ExtentReports Rpt = new ExtentReports(System.getProperty("user.dir") + "//Myrpt.html");
			ExtentTest test;
			Rpt.loadConfig(new File(System.getProperty("user.dir") + "//extent-config.xml"));
			test = Rpt.startTest("Myreport");
			if (Driver.getTitle().equals("Demo1")) {
				test.log(LogStatus.FAIL, "Test failed");
				System.out.println("Test fail");
				
			}

			else {
				ss();
				test.log(LogStatus.PASS, test.addScreenCapture("C:\\POOJA\\Screenshots\\ss4_"+date+"_.png")+"Test Passed");
				System.out.println("Test pass");
				
			}
			Rpt.endTest(test);
			Rpt.flush();
		} catch (Exception e) {
			System.out.println("Report test failed"+e);
		}
	}
	
	@Test(priority=12)
	public void SubmitTest() throws IOException
	{
		Ewait("Submitbtn");
		Driver.findElement(By.xpath(obj.getProperty("Submitbtn"))).click();
	}
	
	
}
	
	

		 

package advancereporting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

public class AdvanceDemo {
	WebDriver driver;
	static String date1;
	ExtentReports rpt=new ExtentReports(System.getProperty("user.dir")+"\\rp.html");
	ExtentTest Test;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		AdvanceDemo d=new AdvanceDemo();
		d.launch();
		//d.report();
		d.report2();
		
	}
		public void launch()
		{
		
		try {
			FileInputStream file1;
		file1=new FileInputStream("C://POOJA//Automation_PPT//readex1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(file1);
		XSSFSheet ws=wb.getSheetAt(0);
		
		String Username=ws.getRow(1).getCell(0).getStringCellValue();
		String Pswrd=ws.getRow(1).getCell(1).getStringCellValue();
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//pooja.patel//workspace//Selenium//Driver1//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");	
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(Username);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys(Pswrd);
		Thread.sleep(2000);
		driver.findElement(By.id("passwordNext")).click();
		
		driver.navigate().to("https://www.google.com/search?q=google&rlz=1C1CHBF_enIN857IN857&oq=google&aqs=chrome..69i57j69i60l3.2470j0j7&sourceid=chrome&ie=UTF-8");
		
		
	
		/*date1=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File("C://POOJA//Screenshots//abc"+date1+".png"));*/
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		}
		/*public void report() throws IOException
		{
			date1=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
			File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(ss, new File("C://POOJA//Screenshots//abc"+date1+".png"));
			
			rpt.loadConfig(new File(System.getProperty("user.dir")+"//extent-config.xml"));
			Test=rpt.startTest("MyTest");
			if(driver.getTitle().equals("google - Google Search1"))
			{
				Test.log(LogStatus.PASS, Test.addScreenCapture("C://POOJA//Screenshots//abc"+date1+".png")+"Test successfull");
				System.out.println("Test pass");
			}
			else
			{
				Test.log(LogStatus.FAIL,Test.addScreenCapture("C://POOJA//Screenshots//abc"+date1+".png")+ "Test fail");
				System.out.println("Test fail");
			}
			rpt.endTest(Test);
			rpt.flush();		
		}*/
		
		public void report2() throws IOException
		{
			date1=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
			File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(ss, new File("C://POOJA//Screenshots//abc"+date1+".png"));
			
			rpt.loadConfig(new File(System.getProperty("user.dir")+"//extent-config.xml"));
			Test=rpt.startTest("MyTest");
			
			
			String Ex_result="https://www.google.com/search?q=google&rlz=1C1CHBF_enIN857IN857&oq=google&aqs=chrome..69i57j69i60l3.2470j0j7&sourceid=chrome&ie=UTF-8";
			try {
				Assert.assertEquals(Ex_result, driver.getCurrentUrl());
				System.out.println("Assert done");
				Test.log(LogStatus.PASS, "Test succsessfull");
			} catch (Error e) {
				Test.log(LogStatus.FAIL, "Test fail");
				
			}			
			
			rpt.endTest(Test);
			rpt.flush();
		}

	}



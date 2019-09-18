package Auto_Assement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example3Methods {
	WebDriver driver;
	static Properties obj=new Properties();
	static FileInputStream file1;
	String email;
	String pswrd;
	static Actions a ;
	static String browser ;
	static{
		try {
			file1 = new FileInputStream(System.getProperty("user.dir") + "//Locators//AssesmntLocators.properties");
			obj.load(file1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void mouse(String key)
	{
		
		a= new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath(obj.getProperty(key)))).build().perform();
	}
	
	/*public void Scroll(int n1,int n2)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,1500)");
		
	}*/
	public void Applaunch(String browser,String url)
	{
		try {
			if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C://Users//pooja.patel//workspace//Selenium//Driver1//chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C://Users//pooja.patel//workspace//Selenium//Driver1//geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver",
						"C://Users//pooja.patel//workspace//Selenium//Driver1//IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	/*public void Objrep() throws IOException
	{
		try {
			file1 = new FileInputStream(System.getProperty("user.dir") + "//Locators//AssesmntLocators.properties");
			obj.load(file1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}*/
	
	public void Ewait(String Epath) throws IOException
	{
		try {
	
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(obj.getProperty(Epath))));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public void click(String clickpath)
	{
		driver.findElement(By.xpath(obj.getProperty(clickpath))).click();
		}
	
	public void sendkeys(String spath,String value)
	{
		driver.findElement(By.xpath(obj.getProperty(spath))).sendKeys(value);
	}
	
	public void Excelread() throws IOException
	{
		file1=new FileInputStream(System.getProperty("user.dir")+"//Assessmntread.xls");
		HSSFWorkbook wb=new HSSFWorkbook(file1);
		HSSFSheet ws=wb.getSheetAt(0);

		email=ws.getRow(1).getCell(0).getStringCellValue();
		pswrd=ws.getRow(1).getCell(1).getStringCellValue();
	}
	
	
	
	
	

}

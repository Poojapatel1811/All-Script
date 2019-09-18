package crossbrowsertesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {
	WebDriver driver=new ChromeDriver();
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		ObjectRepository obj=new ObjectRepository();
		obj.launch();
		obj.createemail();
		
		
	}
		
		public void launch()
		{
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		}
		
		public void createemail() throws IOException
		{
			Properties obj=new Properties();																												
			FileInputStream objfile= new FileInputStream("C://Users//pooja.patel//workspace//Selenium//src//object1.properties");
			obj.load(objfile);
			
		
		driver.findElement(By.xpath(obj.getProperty("fname"))).sendKeys("Pooja");
		driver.findElement(By.xpath(obj.getProperty("lname"))).sendKeys("Patel");
		driver.findElement(By.xpath(obj.getProperty("emailid"))).sendKeys("pjpatel181195");
		
		driver.findElement(By.xpath(obj.getProperty("paswrd"))).sendKeys("pjpatel12345");
		driver.findElement(By.xpath(obj.getProperty("cnfrm_pswrd"))).sendKeys("pjpatel12345");
		
		//driver.findElement(By.xpath(obj.getProperty("next"))).click();
		
		}
		
		public void login()
		{
			
		}
		
		
		
		
		
	}



package Demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailregistration {
	
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		 
		 driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Parsika");
			driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Patel");
			driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("parsika1811");
			
			driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("parsika143");
			driver.findElement(By.xpath("//input[@aria-label='Confirm']")).sendKeys("parsika143");
			/*driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
			
			driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("7698509636");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='CwaK9']")).click();
			
			
			Thread.sleep(30000);
			
			driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();*/
			
			driver.navigate().to("https://accounts.google.com/ServiceLogin/identifier?elo=1&flowName=GlifWebSignIn&flowEntry=AddSession");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("parsika1811@gmail.com");
			
			driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("parsika143");
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Gmail']")).click();
	}		

}

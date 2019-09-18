package select_action_alert_popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AlertTypes {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);	
		driver.get("http://www.echoecho.com/javascript4.htm");
	
		driver.findElement(By.xpath("//input[@value='alert box']")).click();
		Thread.sleep(5000);
		Alert firstalert = driver.switchTo().alert();
		firstalert.accept();	
		Thread.sleep(5000);
		
		
		
		driver.findElement(By.xpath("//input[@value='confirm box']")).click();
		Thread.sleep(5000);
		Alert secondalert = driver.switchTo().alert();
		secondalert.accept();
		Thread.sleep(5000);
	
		
		driver.findElement(By.xpath("//input[@value='prompt box']")).click();
		Thread.sleep(5000);
		Alert thirdalert = driver.switchTo().alert();
		//thirdalert.sendKeys("Hello,This is a prompt box");
		thirdalert.accept();
		
		
		driver.quit();
	}

}

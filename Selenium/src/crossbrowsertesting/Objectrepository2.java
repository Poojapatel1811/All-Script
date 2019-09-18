package crossbrowsertesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Objectrepository2 {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("https://xyzrge-trials65.orangehrmlive.com/");
		
		Properties obj=new Properties();																												
		FileInputStream objfile= new FileInputStream("C://Users//pooja.patel//workspace//Selenium//src//object1.properties");
		obj.load(objfile);
		
		
		
			
		driver.get(obj.getProperty("orange"));
		
		driver.findElement(By.xpath(obj.getProperty("username"))).sendKeys("Admin");
		driver.findElement(By.xpath(obj.getProperty("password"))).sendKeys("68ofLDp@FB");
		driver.findElement(By.xpath(obj.getProperty("Click"))).click();
		
		driver.findElement(By.xpath(obj.getProperty("Admin"))).click();
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("Admin")));
		
		driver.findElement(By.xpath(obj.getProperty("Comp"))).click();
	}

}

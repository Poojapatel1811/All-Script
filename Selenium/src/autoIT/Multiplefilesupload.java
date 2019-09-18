package autoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiplefilesupload {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe"); 
		 WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
		 driver.get("https://online2pdf.com/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//button[text()='Select files']")).click();
		 Thread.sleep(5000);
		 
		 /*Actions a= new Actions(driver);
		 a.keyDown(Keys.CONTROL).perform();
		 */
		 
		 
		 Runtime.getRuntime().exec("C://POOJA//AutoIT//MultiFileupload.exe");
		 
		
		
		 driver.findElement(By.xpath("//button[text()='Browse...']")).click();
		
		 Thread.sleep(2000);
		 Runtime.getRuntime().exec("C://POOJA//AutoIT//Fileupload2.exe");
		 
		 driver.findElement(By.xpath("//button[@onclick='input_file_click(2)']")).click();
			
		 Thread.sleep(2000);
		 Runtime.getRuntime().exec("C://POOJA//AutoIT//Fileupload3.exe");
		 
	}

}

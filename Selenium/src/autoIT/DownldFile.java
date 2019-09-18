package autoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownldFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver","C://Users//pooja.patel//workspace//Selenium//Driver1//geckodriver.exe"); 
		 WebDriver driver= new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("http://the-internet.herokuapp.com/download");
		 driver.findElement(By.xpath("//a[@href='download/some-file.txt']")).click();
		 
		 Thread.sleep(2000);
		 Runtime.getRuntime().exec("C:\\POOJA\\AutoIT\\Download.exe");
		 
	}
}

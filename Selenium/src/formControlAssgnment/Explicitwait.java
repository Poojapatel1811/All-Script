package formControlAssgnment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		 
		 WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 driver.get("https://www.google.com/search?q=sign+in&rlz=1C1CHBF_enIN857IN857&oq=sign+in&aqs=chrome.0.69i59l2j0j69i60j69i61l2.2183j0j7&sourceid=chrome&ie=UTF-8");
		 driver.findElement(By.xpath("//a[@href='https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward']")).click();
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pujapatel1405@gmail.com");
		 
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@type='email']")));
		
		 driver.findElement(By.xpath("//span[@class='NlWrkb snByac']")).click();	
		 
		 driver.quit();
	}

}

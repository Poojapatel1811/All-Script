package formControlAssgnment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maxlength {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.wufoo.com/html5/maxlength-attribute/");
		Thread.sleep(2000);
		//driver.findElement(By.name("text")).sendKeys("1234567890");
		//driver.findElement(By.xpath("//textarea[@name='text2']")).sendKeys("12345678912345678912");
	    
		
	WebElement int1=driver.findElement(By.name("text"));
	System.out.println(int1.getAttribute("maxlength"));
	WebElement int2=driver.findElement(By.xpath("//textarea[@name='text2']"));
	System.out.println(int2.getAttribute("maxlength"));
	}

}

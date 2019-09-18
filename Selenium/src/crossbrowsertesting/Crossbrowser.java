package crossbrowsertesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Crossbrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pooja.patel\\workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pooja.patel\\workspace\\Selenium\\Driver1\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\pooja.patel\\workspace\\Selenium\\Driver2\\IEDriverServer.exe");
		WebDriver driver2=new InternetExplorerDriver();
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();

		
		String url="https://www.guru99.com/live-ecommerce-project.html";
			
	
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='awf_field-94429408']")).sendKeys("poojapatel1811@gmail.com");
		driver.findElement(By.xpath("//input[@id='af-submit-image-1137227143']")).click();
	
		
		
		driver1.get(url);
		driver1.findElement(By.xpath("//input[@id='awf_field-94429408']")).sendKeys("poojapatel1811@gmail.com");
		driver1.findElement(By.xpath("//input[@id='af-submit-image-1137227143']")).click();
		
		
		
		driver2.get(url);
		driver2.findElement(By.xpath("//input[@id='awf_field-94429408']")).sendKeys("poojapatel1811@gmail.com");
		driver2.findElement(By.xpath("//input[@id='af-submit-image-1137227143']")).click();
	
	
		
	}

}

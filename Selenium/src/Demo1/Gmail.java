package Demo1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gmail {


	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		 
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://accounts.google.com/signin/v2/identifier?service=CPanel&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		 Thread.sleep(3000);
				 
		 By input3=By.xpath("//input[@id='identifierId']");
		 WebElement enteremail=driver.findElement(input3);
		 enteremail.sendKeys("pujapatel1405@gmail.com");
		 Thread.sleep(1000);
		
		 By input4=By.xpath("//span[@class='RveJvd snByac']");
		 WebElement clicknext=driver.findElement(input4);
		 clicknext.click(); 
		 Thread.sleep(3000);	 
		 
		 WebElement enterpwd = driver.findElement(By.xpath("//input[@name='password']"));
		 enterpwd.sendKeys("#@pooja@#1995");
		 Thread.sleep(2000);
		 
		 driver.navigate().refresh();
		 
		 WebElement next= driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		 next.click();
		 Thread.sleep(2000);
	
		 WebElement menu = driver.findElement(By.xpath("//*[@class='gb_Ve']"));
		 menu.click();
		 Thread.sleep(3000);
		 
		 WebElement gmailicon=driver.findElement(By.xpath("//a[@id='gb23']//span[@class='gb_m']"));
		 gmailicon.click();
		 Thread.sleep(5000);
		 WebElement composemail1=driver.findElement(By.xpath("//*[@id=':k0']/div/div"));
		 composemail1.click();
		 Thread.sleep(5000);
	
		 driver.quit();
	}
	
		
}


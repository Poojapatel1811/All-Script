package Demo1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gmail2 {


	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		 
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		 Thread.sleep(3000);	 
				 
		 By input3=By.xpath("//input[@id='identifierId']");
		 WebElement enteremail=driver.findElement(input3);
		 enteremail.clear();
		 enteremail.sendKeys("pujapatel1405@gmail.com");
		 Thread.sleep(1000);
		
		 By input4=By.xpath("//span[@class='RveJvd snByac']");
		 WebElement clicknext=driver.findElement(input4);
		 clicknext.click(); 
		 Thread.sleep(3000);	 
		 
		 WebElement enterpwd = driver.findElement(By.xpath("//input[@name='password']"));
		 enterpwd.sendKeys("#@pooja@#1995");
		 Thread.sleep(3000);
		 
		 WebElement next= driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		 next.click();
		 Thread.sleep(2000);
		 
		 driver.navigate().refresh();
			 
		 WebElement composemail1=driver.findElement(By.xpath("//*[@id=':k0']/div/div"));
		 composemail1.click();
		 Thread.sleep(10000);
		 
		 WebElement sendto = driver.findElement(By.xpath("//textarea[@name='to']"));
		 sendto.sendKeys("surtivipula@gmail.com");
		 sendto.click();
		 Thread.sleep(5000);
		 
		 WebElement subject=driver.findElement(By.xpath("//input[@name='subjectbox']"));
		 subject.sendKeys("Introduction");
		 Thread.sleep(5000);
		 
		 WebElement Message= driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']"));
		 Message.sendKeys("Hii,How are you?");
		 Thread.sleep(5000);
		
		 
		 WebElement sendbutton=driver.findElement(By.xpath("//div[@aria-label='Send ‪(Ctrl-Enter)‬']"));
		 sendbutton.click();
		 Thread.sleep(4000);
		 
		
	}
}


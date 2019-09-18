package select_action_alert_popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Event {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.google.com/");
		 driver.findElement(By.xpath("//input[@aria-haspopup='false']")).sendKeys("1Rivet");
		 Actions act=new Actions(driver);
		 
		 act.sendKeys(Keys.RETURN).perform();
		 
		 WebElement click= driver.findElement(By.xpath("(//a[@class='q qs'])[2]"));
		 
		 act.moveToElement(click).perform(); 
		 click.click();
		 
		 
		driver.navigate().to("https://www.wufoo.com/html5/maxlength-attribute/");
		driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("I am Pooja Patel");
		act.sendKeys(Keys.TAB).perform();
		
		driver.findElement(By.xpath("//textarea[@maxlength='20']")).sendKeys("I am come from Daman");
		driver.findElement(By.xpath("//input[@type='submit']")).click();		
	}

}

package select_action_alert_popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Event2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 
		 driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		 Actions a= new Actions(driver);
		 a.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();
		 Thread.sleep(2000);
		 Alert alert1 = driver.switchTo().alert();
		 alert1.accept();
		 Thread.sleep(5000);
		 
		 a.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
		 driver.findElement(By.xpath("//span[text()='Quit']")).click();
		 Thread.sleep(2000);
		 Alert alert2= driver.switchTo().alert();
		 alert2.accept();
		 
		 driver.navigate().to("https://www.wufoo.com/html5/maxlength-attribute/");
		 
		 Thread.sleep(5000);
		 
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,750)");
		 Thread.sleep(3000);
		 
		 a.keyDown(Keys.SHIFT).perform();
		 driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("poojapatel");
		 a.keyUp(Keys.SHIFT).perform();	 
	}

}

package select_action_alert_popup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Actionclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		 
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.toolsqa.com/automation-practice-form/");
		 driver.manage().window().maximize();
		 //driver.findElement(By.id("cookie_action_close_header")).click();
		 Thread.sleep(3000);
		
		 Actions act1 = new Actions(driver);
		 act1.keyDown(Keys.SHIFT).perform();
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pooja");
		 act1.keyUp(Keys.SHIFT).perform();	 
		 
		 
		 Actions act2 = new Actions(driver);
		 act2.keyDown(Keys.SHIFT).perform();
		 driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("patel");
		 act1.keyUp(Keys.SHIFT).perform();
		 
		
		driver.findElement(By.xpath("//input[@id='sex-1']")).click(); 
		Thread.sleep(2000);
		 
		 try {
			driver.findElement(By.xpath("//input[@id='exp-1']")).click();
		 Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println("Exception"+e);
		}		 
		
		List<WebElement> abc = driver.findElements(By.xpath("//input[@type='checkbox']"));
		 
		 String value="Automation Tester,Manual Tester,QTP,";
		 List<String> list = new ArrayList<String>(Arrays.asList(value.split(",")));
		 
		 for (String check : list)
		 { 
		 for (WebElement chk : abc)
		 {
		 
			 if(chk.getAttribute("value").equalsIgnoreCase(check))
			 {
				 chk.click();
				 Thread.sleep(1000);
			 }
		 }
		 }
		 
		 try
		 {
			 driver.findElement(By.xpath("//input[@name='photo']")).sendKeys("C://POOJA//Automation_PPT1");
			 Thread.sleep(2000);
		 }
		 catch(Exception e)
		 {
			 System.out.println("file==>>>>>>"+e);
		 }
	
		 
		 Select dropdown=new Select(driver.findElement(By.name("continents"))); 
		 dropdown.selectByVisibleText("South America");
		 Thread.sleep(2000);		 
		 dropdown.selectByIndex(2);
		 driver.quit();
	}
}

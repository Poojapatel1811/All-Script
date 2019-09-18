  package Demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.map.StaticBucketMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.model.ScreenCapture;

public class Registrationform {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://demo.automationtesting.in/Register.html");
		 Thread.sleep(3000);	 
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Pooja");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Patel");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("801,Moti vankad,Nani Daman,Daman-396210");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("puajapatel198752@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9824569812");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		
		
		
		List<WebElement> abc1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
		String value="Cricket,Hockey,";
		List<String> list = new ArrayList<String>(Arrays.asList(value.split(",")));
		System.out.println(list); 
		 for (String check : list)
		 { 
		 for (WebElement chk : abc1)
		 {
		 
			 if(chk.getAttribute("value").equalsIgnoreCase(check))
			 {
				 chk.click();
				 Thread.sleep(1000);
			 }
		 }
		
	
		/*for (WebElement list : abc1)
		{
		if(!(list.isSelected()))
		{
			list.click();
		}
		*/
		
		}
		 
		 
		WebElement dropdown1 =driver.findElement(By.xpath("//div[@id='msdd']"));
		dropdown1.click();
		Select drp = new Select(dropdown1);
		drp.selectByVisibleText("Bulgarian");
		
		
		 
		
		 

		 
		 
		// wait.until(ExpectedConditions.visibilityOfAllElements("//a[text()='ujgfsdkhjf']"));
		 
		 
		 
	
		 
		 
		

		
/*List<WebElement> dropdown1 =driver.findElements(By.xpath("//div[@id='msdd']"));
		
		for (WebElement d : dropdown1)
		{
			System.out.println(d.getText());
		}
		
		Thread.sleep(2000);
		*/
		//driver.findElement(By.xpath("input[@id='firstpassword']")).sendKeys("pooja@123");
		//driver.findElement(By.xpath("input[@id='secondpassword']")).sendKeys("pooja@123");
		//driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
		

		//Thread.sleep(3000);
	}

}

package waitscreenshots;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class screenshots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		 
			Date date = new Date();
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		/*String date;
		date=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(date);
		*/
			
		
		
		 WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 driver.get("http://demo.guru99.com/test/delete_customer.php");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pooja");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		 Alert alert1 = driver.switchTo().alert();
		 String alerttxt1 = alert1.getText();
		 System.out.println("First Alert Text is:"+alerttxt1);
		 alert1.accept();

		 Alert alert2= driver.switchTo().alert();
		 String alerttxt2= alert2.getText();
		 System.out.println("Second Alert Text is:"+alerttxt2);
		 alert2.accept();
		 
		 File ssFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(ssFile, new File("C:\\POOJA\\Screenshots\\ss1"+dateFormat1.format(date)+".png"));
		
		 System.out.println(date);
		 System.out.println(dateFormat1.format(date));
		 driver.quit();
		 
		 
		 Date date1 = new Date();
		 
		 System.out.println(date1);
		 
		 File Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy( Screenshot , new File("C:\\POOJA\\Screenshots\\ss1\\abc.png"));
		 
		
		 
		 
		 
		 
	}

}

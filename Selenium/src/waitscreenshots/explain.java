package waitscreenshots;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class explain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://google.com");
		
		Date date =  new Date();
		System.out.println(date);
		
		
		SimpleDateFormat df = new SimpleDateFormat("MM:YYYY:dd");
		System.out.println(df.format(date));
		
		 
		 File Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileHandler.copy( Screenshot , new File("C://POOJA//Screenshots//ss1//abc"+df.format(date)+".png"));

		
		//DateFormat df = DateFormat()
	}

}

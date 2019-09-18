package autoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WinAuthentication {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pooja.patel\\workspace\\Selenium\\Driver1\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\pooja.patel\\workspace\\Selenium\\Driver2\\IEDriverServer.exe");
		WebDriver driver2=new InternetExplorerDriver();
		
			/*System.setProperty("webdriver.chrome.driver","C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe"); 
			 WebDriver driver= new ChromeDriver();*/
		
			 driver1.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 driver1.manage().window().maximize();
			 driver1.get("http://the-internet.herokuapp.com/basic_auth");
			 Thread.sleep(3000);
			 
			 driver2.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 driver2.manage().window().maximize();
			 driver2.get("http://the-internet.herokuapp.com/basic_auth");
			
			 Thread.sleep(3000);
			 
			 Runtime.getRuntime().exec("C://POOJA//AutoIT//WinAuthentication.exe"); 
			 
			 
			 Thread.sleep(3000);
			 
			 Runtime.getRuntime().exec("C://POOJA//AutoIT//WinAuth2.exe");  		 
			 
			 
			 
	}
}

package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		 
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 //Thread.sleep(5000);
		 By input=By.xpath("//input[@name='q']");
		 WebElement searchelement=driver.findElement(input);
		 searchelement.clear();
		 //Thread.sleep(5000);
		 searchelement.sendKeys("1Rivet");
		 //Thread.sleep(5000);
		 By input1=By.xpath("//*[@id='tsf']/div[2]/div/div[3]/center/input[1]");
		 WebElement Searchbutton = driver.findElement(input1);
		 Searchbutton.click();
		//driver.quit();
	}

}

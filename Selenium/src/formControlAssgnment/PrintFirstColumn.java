package formControlAssgnment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintFirstColumn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//pooja.patel//workspace//Selenium//Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> table=driver.findElements(By.xpath("//table[@id='customers']//td[1]"));
		
		for (WebElement input : table)
		{
			System.out.println(input.getText());
		}
		

		/*for (int i = 0; i < table.size(); i++) {
			System.out.println(table.get(i).getText());
		*/	
		}
		
	
	}


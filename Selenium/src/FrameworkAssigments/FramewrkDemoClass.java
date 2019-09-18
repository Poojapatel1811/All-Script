package FrameworkAssigments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.io.IOException;

import org.openqa.selenium.By;

public class FramewrkDemoClass extends FrameworkDemo{

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
	OpenBr("Chrome","https://www.youtube.com/");
	Sendkeys("search1","1Rivet Valsad");
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	click();
	
	
	/*OpenBr("Firefox","https://www.youtube.com/");
	Sendkeys("search1","1Rivet Valsad");
	
	Robot r1=new Robot();
	r1.keyPress(KeyEvent.VK_ENTER);
	r1.keyRelease(KeyEvent.VK_ENTER);
	click();*/
	driver1.navigate().to("https://www.google.com/");
	Thread.sleep(1000);
	driver1.findElement(By.xpath("//input[@name='q']")).sendKeys("GTU");
	
	Event();
	Event1();
	driver1.findElement(By.xpath(obj.getProperty("img"))).click();
	
	
	
	
	
	//driver1.navigate().to("https://www.wufoo.com/html5/maxlength-attribute/");
	
	
	/*r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	
	r.keyRelease(KeyEvent.VK_ALT);
	r.keyRelease(KeyEvent.VK_TAB);
	*/
	
	}
	
}

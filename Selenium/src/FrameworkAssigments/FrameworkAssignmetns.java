package FrameworkAssigments;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FrameworkAssignmetns extends MyFramework {

	public static void main(String[] args) throws IOException {
		Properties obj=new Properties();
		FileInputStream objectfile=new FileInputStream("C:/Users/pooja.patel/workspace/Selenium/Locators/ObjectRep.properties"); 
		obj.load(objectfile);
OpenApp("Chrome","https://www.google.com/");
Sendkeys("Selenium");
/*MyFramework.quitbrowser();*/
	}
}


package Day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilenotfoundException2 {

	public static void main(String[] args) {
		try
		{
			File file = new File("C:\\POOJA\\Automation Testing_ Assignments");
			FileReader f = new FileReader(file); 
			
		}
		catch(FileNotFoundException e)
		{
				System.out.println("file does not exist");
		}
	}

}

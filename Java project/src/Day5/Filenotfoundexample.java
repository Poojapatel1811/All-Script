package Day5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Filenotfoundexample {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\POOJA\\Automation_PPT1");
		BufferedReader fileinput = new BufferedReader(file);
		System.out.println(fileinput.readLine());
	}

}

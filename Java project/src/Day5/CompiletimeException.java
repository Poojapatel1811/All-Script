package Day5;
import java.io.BufferedReader;
import java.nio.file.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CompiletimeException 
{

	public static void main(String[] args) throws IOException{
		FileReader file = new FileReader("c:\\pooja\\compiletimeexc.txt");
		BufferedReader fileInput = new BufferedReader(file);
		System.out.println(fileInput.readLine());
	}
			
}

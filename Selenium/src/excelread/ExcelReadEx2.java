package excelread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadEx2 {

	private static final String NuLL = null;

	public static void main(String[] args) throws IOException {
		File file=new File("C://POOJA//Automation_PPT//readex1.xlsx");
		FileInputStream  fls = new FileInputStream(file);


		XSSFWorkbook  wb =  new XSSFWorkbook(fls);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int RowCount=sheet1.getLastRowNum();
		System.out.println("Total rows:"+RowCount);
		
		String data0=NuLL;
		for(int i=1;i<RowCount +1;i++)
		{
			for(int j=0;j<2;j++)
			{
				String data1=sheet1.getRow(i).getCell(j).getStringCellValue();
				System.out.println("Excel data"+data1);

			}
			System.out.println("\n");
		}

	}

}

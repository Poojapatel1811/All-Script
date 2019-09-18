package ExcelWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelWriteEx2 {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File("D://excelwr1.xls");
		FileInputStream file2 = new FileInputStream(file1);
		
		HSSFWorkbook wb=new HSSFWorkbook(file2);
		HSSFSheet ws=wb.getSheetAt(0);
		
		int Rowc=ws.getLastRowNum()+1;
		int Colc=ws.getRow(0).getLastCellNum();
		//System.out.println(Colc);
		
		System.out.println("Total no of rows: "+Rowc);
		System.out.println("Total no of Column: "+Colc);
		
		for(int i=0;i<Rowc;i++)
		{
			for(int j=0;j<Colc;j++)
			{
				String Data=ws.getRow(i).getCell(j).getStringCellValue();
				ws.getRow(0).createCell(2).setCellValue("Pass/Fail");
				if(Data.equals("Y"))
				{
					ws.getRow(i).createCell(Colc).setCellValue("Pass");
					
				}
				else if(Data.equals("N"))
				{
					ws.getRow(i).createCell(Colc).setCellValue("Fail");						
				}
			}
		}
		
		FileOutputStream fip= new FileOutputStream("D://updated1.xsl");
		wb.write(fip);
		fip.close();
		}

}

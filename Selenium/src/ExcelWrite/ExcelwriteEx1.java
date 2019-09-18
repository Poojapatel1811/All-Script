package ExcelWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ExcelwriteEx1 {

	public static void main(String[] args) throws IOException {
		File file1=new File("C://POOJA//Automation_PPT//Exwrite.xls");
		FileInputStream input1=new FileInputStream(file1);
		
		HSSFWorkbook wb=new HSSFWorkbook(input1);
		HSSFSheet ws=wb.getSheetAt(0);
		
		int rowc=ws.getLastRowNum();
		int colc=ws.getRow(0).getLastCellNum();
		
		System.out.println("Total no. of Rows"+rowc);
		System.out.println("Total no. of Column"+colc);
		
		ws.getRow(1).createCell(1).setCellValue("Pass");
		ws.getRow(2).createCell(1).setCellValue("Fail");
		ws.getRow(3).createCell(1).setCellValue("Fail");
		ws.getRow(4).createCell(1).setCellValue("Pass");
		ws.getRow(5).createCell(1).setCellValue("Pass");
		ws.getRow(6).createCell(1).setCellValue("Pass");

	
		FileOutputStream output1=new FileOutputStream(file1);
		wb.write(output1);
		wb.close();
		
		}
		
	}

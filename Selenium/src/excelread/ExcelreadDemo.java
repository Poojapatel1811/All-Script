package excelread;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelreadDemo { 

public static void main(String[] args) throws IOException {
File file = new File("C://POOJA//Automation_PPT//file1.xlsx.");
FileInputStream  fls = new FileInputStream(file);


XSSFWorkbook  wb =  new XSSFWorkbook(fls);
XSSFSheet sheet1 = wb.getSheetAt(0);
String data0 = sheet1.getRow(1).getCell(0).getStringCellValue();
System.out.println("Data from Excel is "+data0);

String data1= sheet1.getRow(1).getCell(1).getStringCellValue();
System.out.println("Data from Excel is "+data1);
}
}


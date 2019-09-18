package excelread;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadEx1 {
	private XSSFSheet ExcelWSheet;
	   private XSSFWorkbook ExcelWBook;
	   
	   public static void main(String[] args) throws Exception {
	   ExcelReadEx1 dd =new ExcelReadEx1("C://Users//pooja.patel//TestData.xlsx","Sheet1");
	      System.out.println("The Row count is " + dd.excel_get_rows());

	      dd.getCellDataasnumber(1, 1);
	      dd.getCellDataasnumber(1, 2);
	      dd.getCellDataasnumber(1, 3);
	      dd.getCellDataasnumber(2, 1);
	      dd.getCellDataasnumber(2, 2);
	      dd.getCellDataasnumber(2, 3);
	      dd.getCellDataasnumber(3, 1);
	      dd.getCellDataasnumber(3, 2);
	      dd.getCellDataasnumber(3, 3);
	   }

	   
public ExcelReadEx1(String path, String sheetname) throws Exception {
		// TODO Auto-generated constructor stub
    try {
        // Open the Excel file
        FileInputStream ExcelFile = new FileInputStream(path);
        
        // Access the required test data sheet
        ExcelWBook = new XSSFWorkbook(ExcelFile);
        ExcelWSheet = ExcelWBook.getSheet(sheetname);
     } catch (Exception e) {
        throw (e);
     }
  }

//This method is to set the rowcount of the excel.
public int excel_get_rows() throws Exception {

   try {
      return ExcelWSheet.getPhysicalNumberOfRows();
   } catch (Exception e) {
      throw (e);
   }
}
//This method to get the data and get the value as strings.
public String getCellDataasstring(int RowNum, int ColNum) throws Exception {

   try {
      String CellData =
         ExcelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
      System.out.println("The value of CellData " + CellData);
      return CellData;
   } catch (Exception e) {
      return "Errors in Getting Cell Data";
   }
}

//This method to get the data and get the value as number.
public double getCellDataasnumber(int RowNum, int ColNum) throws Exception {

   try {
      double CellData =
         ExcelWSheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
      System.out.println("The value of CellData " + CellData);
      return CellData;
   } catch (Exception e) {
      return 000.00;
   }
}

}
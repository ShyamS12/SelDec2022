package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyExcel 
{

 public static String[][] readExcel(String filename) throws IOException 
 {
  @SuppressWarnings("resource")
  XSSFWorkbook book = new XSSFWorkbook("./books/"+filename+".xlsx");
  XSSFSheet sheet = book.getSheetAt(0);
  int lastRow = sheet.getLastRowNum();
  int lastCell = sheet.getRow(0).getLastCellNum();
  
  String[][] data = new String[lastRow][lastCell]; 
  
  for(int i=1; i<=lastRow;i++) 
  {
   XSSFRow row = sheet.getRow(i);
   
   for(int j=0; j<lastCell;j++) 
   {
    XSSFCell cell = row.getCell(j);     
    String stringCellValue = cell.getStringCellValue();
    data[i-1][j]=stringCellValue;
    System.out.println(stringCellValue);
   }
  }
  
  return data;
 }

}

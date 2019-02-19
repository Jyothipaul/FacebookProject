package utilities;

import java.io.*;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import static steps.Hooks.cFR;

public class SpreadsheetReader {

    public void readSpreadsheet(String fileName,String sheetName) throws IOException{

        File filepath = new File(cFR.getSpreadsheetPath());
        FileInputStream inputStream = new FileInputStream(filepath+"\\"+fileName);

        Workbook srWorkbook= new XSSFWorkbook(inputStream);
        Sheet srWorkbookSheet = srWorkbook.getSheet(sheetName);

        int sheetCount = srWorkbook.getNumberOfSheets();
        System.out.println("Sheet Count is "+sheetCount);

        int rowCount = srWorkbookSheet.getLastRowNum()-srWorkbookSheet.getFirstRowNum();
        System.out.println("Row Count is "+rowCount);

        for (int i = 1; i < rowCount+1; i++) {
            Row row = srWorkbookSheet.getRow(i);
            //Create a loop to print cell values in a row
            for (int j = 0; j < row.getLastCellNum(); j++) {
                String email = row.getCell(j).getStringCellValue();
                System.out.print(email +"  ");
            }

            System.out.println();
        }
    }
}

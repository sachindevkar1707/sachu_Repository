package readExceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExceldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provide the path of the excel sheet
		Workbook wb = WorkbookFactory.create(fis);//make the file ready to read
		Sheet sheet = wb.getSheet("IPL");//get into the sheet
		
	    for(int i=1;i<=9;i++)
	    {
	    	Row row = sheet.getRow(i);//get into the desired row
			Cell cell = row.getCell(1);//get into the desired cell/column
		    String data = cell.getStringCellValue();//read the value from the cell/column
		    System.out.println(data);
	    }
	    
	}

}

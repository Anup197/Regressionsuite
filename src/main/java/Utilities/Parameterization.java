package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	

 public static String getData(int row, int cell) throws EncryptedDocumentException, IOException {
	
 FileInputStream data = new FileInputStream("D:\\Data.xlsx");
   return WorkbookFactory.create(data).getSheet("logindata").getRow(row).getCell(cell).getStringCellValue();
		
	}
	
	
}

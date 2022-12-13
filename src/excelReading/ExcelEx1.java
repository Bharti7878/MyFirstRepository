package excelReading;

import java.io.File; 


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEx1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myFile = new File("C:\\Users\\Dell\\Desktop\\Java\\excel\\Bharti.xlsx");
		
		
	 String value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	   System.out.println(value1);
		
		
	   
	   String value2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		System.out.println(value2);
		
		
		double value3 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue();
		System.out.println(value3);
		
	}

}

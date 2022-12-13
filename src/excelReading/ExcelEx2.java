package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEx2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	File myFile = new File("C:\\Users\\Dell\\Desktop\\Java\\excel\\Bharti.xlsx");	
		Workbook myworkbook = WorkbookFactory.create(myFile);
		
		
		Sheet mySheet = myworkbook.getSheet("Sheet1");
		
		Row myRow = mySheet.getRow(0);
		
        Cell myCell = myRow.getCell(0);
         
		CellType cellDataType=myCell.getCellType();
		System.out.println("data type is "+cellDataType);
		
		System.out.println(myCell.getStringCellValue());
		
		
		
	}

}

package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceleg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {

		File myFile = new File("C:\\Users\\Dell\\Desktop\\Java\\excel\\Bharti.xlsx");
		
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		
		int TotalNoOfRows = mySheet.getLastRowNum();
			int totalNOofCell = mySheet.getLastRowNum();
			
		for (int i=0;i<=TotalNoOfRows;i++) {
			for(int j=0;j<=totalNOofCell;j++) {
				
				 CellType cellDataType = mySheet.getRow(i).getCell(j).getCellType();
			
			if(cellDataType==CellType.STRING) {
				
				String value=mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value+"");
				}
			else if (cellDataType==CellType.BOOLEAN ) {
				
				
				boolean value = mySheet.getRow(i).getCell(j).getBooleanCellValue();
				System.out.println(value+"");
			}
			else if (cellDataType==CellType.BLANK)
			{
				
			}
			}
			
			System.out.println();
			
		}
	}
			}
	



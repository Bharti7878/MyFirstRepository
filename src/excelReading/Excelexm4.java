package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelexm4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {

		File myFile = new File("C:\\Users\\Dell\\Desktop\\Java\\excel\\Bharti.xlsx");
		
		
		Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		int lastRowNum = mysheet.getLastRowNum();
		
		System.out.println("lastRowNum is "+lastRowNum);
	
		int totalNumOfRows=lastRowNum;
		System.out.println("total Num of Rows are "+totalNumOfRows);
	
		
		short lastCellNum = mysheet.getRow(0).getLastCellNum();
		
		
		System.out.println("Last cell number is "+lastCellNum);
		
		int totalNumOfCells = lastCellNum-1;
		
		System.out.println("Total cells are "+totalNumOfCells);
		
		for(int i=0;i<=totalNumOfRows;i++)
		{
		for(int j=0;j<=totalNumOfCells;j++)
		{
		String value = mysheet.getRow(i).getCell(j).getStringCellValue();
		System.out.print(value+" ");
		}
		System.out.println();		
		
		
		}
		
	}

}

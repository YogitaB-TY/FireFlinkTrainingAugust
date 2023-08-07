package testngBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LearningSingleReadExcel {
	public static Workbook workbook;

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		/*
		 * File file=new File("./TestData/TestData.xlsx"); FileInputStream fis=new
		 * FileInputStream(file); Workbook workbook=WorkbookFactory.create(fis); Sheet
		 * sheet= workbook.getSheet("Login"); sheet.getPhysicalNumberOfRows(); Row
		 * row=sheet.getRow(1); Cell cell=row.getCell(1);
		 * row.getPhysicalNumberOfCells(); System.out.println(cell.toString());
		 */
		
		readMultipleData("Login");
	}
	
	public static String[][] readMultipleData(String sheetName) {
		File file=new File("./TestData/TestData.xlsx");
		
		try {
			FileInputStream fis=new FileInputStream(file);
			workbook=WorkbookFactory.create(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sheet sheet= workbook.getSheet(sheetName);
		int row_size= sheet.getPhysicalNumberOfRows();
		int col_size= sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] data=new String[row_size-1][col_size];
		sheet.getRow(0).getCell(0);
		for (int i = 0; i < row_size-1; i++) { //iterates rows
			for(int j=0;j<col_size;j++) { //iterates columns
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		
		return data;
		
	}
	

}

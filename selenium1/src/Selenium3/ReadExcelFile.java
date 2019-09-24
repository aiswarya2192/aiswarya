package Selenium3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws FileNotFoundException {
		try
		{
	//File file=new File("C:\\Users\\training\\Documents\\Aisu.xlsm");
	FileInputStream File=new FileInputStream(new File("C:\\Users\\training\\Documents\\Standing Order Test Basis.xlsx"));
	//Workbook sampleWorkbook=null;
	XSSFWorkbook workbook=new XSSFWorkbook(File);
	XSSFSheet sheet=workbook.getSheetAt(0);
	Iterator<org.apache.poi.ss.usermodel.Row> rowIterator=sheet.iterator();
	while(rowIterator.hasNext())
	{
		Row row=rowIterator.next();
		Iterator<Cell> cellIterator=row.cellIterator();
		while(cellIterator.hasNext())
		{
			Cell cell=cellIterator.next();
			switch(cell.getCellType())
			{
			case NUMERIC:
				System.out.print(cell.getNumericCellValue());
				break;
				case STRING:
					System.out.print(cell.getStringCellValue());
				break;
			}
		}
		System.out.println("");
	}
	File.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}

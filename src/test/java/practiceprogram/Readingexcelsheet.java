package practiceprogram;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readingexcelsheet 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\Dell\\eclipseajay2024\\MavenProject\\exceldata\\ExcelData.xlsx");
		
		String value1 = WorkbookFactory.create(myfile).getSheet("Sheet2").getRow(0).getCell(1).getStringCellValue();
		
		//System.out.println(value1);
		
	//	double value2 = WorkbookFactory.create(myfile).getSheet("Sheet2").getRow(0).getCell(1).getNumericCellValue();
		
	//	System.out.println(value2);
		
		//read row data first
		
		 Sheet wf = WorkbookFactory.create(myfile).getSheet("Sheet2");
		 
		 for(int i=0;i<=2;i++)
		 {
			String value3 =wf.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value3 +"");
		 }
		
		
	}
}

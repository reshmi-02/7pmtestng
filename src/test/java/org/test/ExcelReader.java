package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelReader {
	
	
	@DataProvider
	public String[][] getData() throws IOException {
		
		File f = new File(System.getProperty("user.dir")+"\\ExcelShhet\\fb.xlsx");
		
		FileInputStream fi = new FileInputStream(f);

		
		Workbook wb = new XSSFWorkbook(fi);
		
		
		Sheet sheet = wb.getSheet("fblogin");
		
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		
		String testData [] [] =  new   String [rowCount-1] [cellcount];   // 4(0-2)  2 (0-1)
		
		
		///{ {val,val..} ,{val,val..} ,{val.,}, {0,0}   }
		//    0 0  0 1      1 0  1 1
		
		
		for(int i=1 ; i<rowCount;i++) {    ///4<4
			
			
			for(int j=0 ; j<cellcount;j++) {   //1<2
				
				DataFormatter format = new DataFormatter();
				
				String data = format.formatCellValue(sheet.getRow(i).getCell(j));  // 3 1
				
				testData[i-1][j] = data;  //2 1
			}
		}
		
		
		return testData;
		 
		
	}
	

}

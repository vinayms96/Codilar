package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {
	public static String getData(String file, String sheet,int rownum,int cellnum) {
		String s="";
		try {
			FileInputStream fi = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fi);
			s = wb.getSheet(sheet).getRow(rownum).getCell(cellnum).getStringCellValue();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return s;
	}
	
	public static int rowCount(String file, String sheet) {
		int row=0;
		try {
			FileInputStream fi = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fi);
			row = wb.getSheet(sheet).getLastRowNum();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return row;
	}

}

package datafromexcel;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static String[][] getexceldata()  {
		
		String file = "./TestData/Testdata.xlsx";
		XSSFWorkbook excel = null;
		
			try {
				excel = new XSSFWorkbook(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

		XSSFSheet sheet = excel.getSheetAt(0);
		
		int row1 = sheet.getLastRowNum();
		System.out.println(row1);
		
		int physicalrow = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalrow);
		
		short lastcellnum = sheet.getRow(0).getLastCellNum();
		System.out.println(lastcellnum);
 
		String[][] data = new String[row1][lastcellnum];
		
		
		for (int j = 1; j <= row1; j++) {
			XSSFRow row = sheet.getRow(j);
		
		for (int i = 0; i < lastcellnum; i++) {
			XSSFCell cell = row.getCell(i);
			DataFormatter dft = new DataFormatter();
			String value = dft.formatCellValue(cell);
				
			
			//String value = cell.getStringCellValue();
	        //System.out.println(value);
			data[i-1][j] = value;
			
			
		}
		
		
		try {
			excel.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
		return getexceldata();
		
}
}



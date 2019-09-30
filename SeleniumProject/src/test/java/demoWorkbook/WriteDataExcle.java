package demoWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteDataExcle {
	@Test
	public void f() throws IOException {
		
			FileInputStream in = new FileInputStream(new File("C:\\Users\\pdc3a-training.pdc3a\\Desktop\\Book.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(in);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int count = sheet.getLastRowNum();
			for(int i=0;i<count;i++)
			{
				Date data = sheet.getRow(i).getCell(0).getDateCellValue();
				System.out.println(data);
			}
			in.close();
			for(int i=1;i<count;i++)
			{
				sheet.getRow(i).createCell(2).setCellValue(i+"-NOV-2019");
			}
			FileOutputStream os = new FileOutputStream(new File("C:\\Users\\pdc3a-training.pdc3a\\Desktop\\Book.xlsx"));
			workbook.write(os);
			os.close();
	}
}

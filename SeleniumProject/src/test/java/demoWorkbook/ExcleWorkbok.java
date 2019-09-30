package demoWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcleWorkbok {
  @Test
  public void f() throws IOException {
	  XSSFWorkbook workbook = new XSSFWorkbook();
	  FileOutputStream out = new FileOutputStream(new File("C:\\Users\\pdc3a-training.pdc3a\\Desktop\\new.xlsx"));
	  workbook.write(out);
	  out.close();
	  System.out.println("File written successfully");
  }
}

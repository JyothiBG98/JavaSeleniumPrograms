package programs;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleOfExcel {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir")+ File.separator+"StudentDetailsinMsoffice1.xlsx";

        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fis);;
        Sheet sheet  = wb.getSheet("sheet1");
        System.out.println("Value: " +sheet.getRow(1).getCell(1).getStringCellValue());


    }
}

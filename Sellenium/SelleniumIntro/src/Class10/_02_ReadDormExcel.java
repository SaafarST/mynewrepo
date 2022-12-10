package Class10;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _02_ReadDormExcel {


    public static void main(String[] args) throws IOException {
        String filepath = System.getProperty("user.dir")+"/testData/EmployeeList.xlsx";
        FileInputStream fis = new FileInputStream(filepath);

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet1 = workbook.getSheet("Sheet1");
        final Row headerRow = sheet1.getRow(0);
        


    }
}

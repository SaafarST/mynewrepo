package Class10;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _04_ExcelToMap {
    public static void main(String[] args) throws IOException {
        String filepath = System.getProperty("user.dir")+"/testData/EmployeeList.xlsx";
        FileInputStream fis = new FileInputStream(filepath);

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet1 = workbook.getSheet("Sheet1");

        int rows = sheet1.getPhysicalNumberOfRows();
        System.out.println("rows = " + rows);
        int columns = sheet1.getRow(0).getPhysicalNumberOfCells();
        System.out.println("columns = " + columns);



    }
}

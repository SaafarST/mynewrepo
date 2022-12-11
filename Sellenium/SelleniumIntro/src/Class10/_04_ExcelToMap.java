package Class10;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.management.ManagementPermission;
import java.util.HashMap;
import java.util.Map;

public class _04_ExcelToMap {
    public static void main(String[] args) throws IOException {
        String filepath = System.getProperty("user.dir")+"/testData/EmployeeList.xlsx";
        FileInputStream fis = new FileInputStream(filepath);

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet1 = workbook.getSheet("Sheet1");

        int rows = sheet1.getPhysicalNumberOfRows();//<---Rows number
        int columns = sheet1.getRow(0).getLastCellNum();//<---Columns number

        Map<String,String> map = new HashMap<>();
        for (int r = 1; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                 String key = sheet1.getRow(0).getCell(c).toString();
                 String value = sheet1.getRow(r).getCell(c).toString();
                 map.put(key, value);
            }
            System.out.println(map);
        }



    }
}

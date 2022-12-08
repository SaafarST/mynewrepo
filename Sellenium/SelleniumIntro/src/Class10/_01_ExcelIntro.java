package Class10;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _01_ExcelIntro {
    public static void main(String[] args) throws FileNotFoundException {
        String filepath = "C:/Users/Nju/Desktop/SD/Excel/ztestfile.xlsx";
        FileInputStream fis = new FileInputStream(filepath);

        Workbook workbook = new XSSFWorkbook();




    }
}

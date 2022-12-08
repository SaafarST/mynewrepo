package Class10;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _01_ExcelIntro {
    public static void main(String[] args) throws IOException {
        String filepath = "C:\\Users\\Nju\\Desktop\\SD\\Excel\\Book1.xlsx";
        FileInputStream fis = new FileInputStream(filepath);

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("A");
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        System.out.println("cell = " + cell);


    }
}

package Class10;

import org.apache.poi.ss.usermodel.*;
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

        Row row1 = sheet.getRow(1);
        Cell cell1 = row1.getCell(3);
        System.out.println("cell1 = " + cell1);

        Row row2 = sheet.getRow(2);
        Cell cell2 = row2.getCell(3);
        System.out.println("cell1 = " + cell2);

        Cell cell3 = sheet.getRow(2).getCell(2);
        System.out.println("cell3 = " + cell3);

        final Cell cell4 = sheet.getRow(0).getCell(2);
        System.out.println("cell4 = " + cell4);

        final CellType cellType = sheet.getRow(0).getCell(2).getCellType();
        System.out.println("cellType = " + cellType);


    }
}

package Class10;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _03_WriteToExcel {
    public static void main(String[] args) throws IOException {
        String filepath = System.getProperty("user.dir")+"/testData/EmployeeList.xlsx";
        FileInputStream fis = new FileInputStream(filepath);

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet1 = workbook.getSheet("Sheet1");
        sheet1.getRow(0).createCell(6).setCellValue("Seniority Level");
        sheet1.getRow(1).createCell(6).setCellValue("Mid-Level");
        sheet1.getRow(2).createCell(6).setCellValue("Entry-Level");
        sheet1.getRow(3).createCell(6).setCellValue("Senior-Level");


        //Task: Write your name and salary
        sheet1.createRow(4).createCell(0).setCellValue("Tju");
        sheet1.getRow(4).createCell(4).setCellValue("SDET");
        sheet1.getRow(4).createCell(5).setCellValue(130_000);

        //Create a new Sheet

        Sheet sheet5 = workbook.createSheet("Sheet5");


        FileOutputStream fos = new FileOutputStream(filepath);
        workbook.write(fos);


    }
}

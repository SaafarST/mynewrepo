package Class10;

import org.apache.poi.ss.usermodel.*;
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
        final Cell r0c5_Salary = headerRow.getCell(5);
        System.out.println("r0c5_Salary = " + r0c5_Salary);

        final Cell r3c4_TitleforMike = sheet1.getRow(3).getCell(4);
        final CellType r3c4_celltype = r3c4_TitleforMike.getCellType();
        System.out.println("r3c4_TitleforMike = " + r3c4_TitleforMike+" DataType "+r3c4_celltype);

        //Getting rows and columns
        final int rows = sheet1.getPhysicalNumberOfRows();//get rows number
        final int cols = sheet1.getRow(0).getPhysicalNumberOfCells();//get cell numbers

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sheet1.getRow(i).getCell(j)+" ");
            }
            System.out.println("");
        }

        //System.out.println(sheet1.getRow(1).getCell(5).getCellType());

    }
}

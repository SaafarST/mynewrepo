package Class17_WebTables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

import static utils.BaseClass.*;

public class _01_WebTablesDemo {
    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/tables");

        List<WebElement> rows = driver.findElements(By.cssSelector("table#table1 tbody tr"));
        int rowSize = rows.size();
        System.out.println("Row size is = " + rowSize);

        System.out.println("Printing rows ===>");

       /* Iterator<WebElement> iterator = rows.iterator();
        while (iterator.hasNext()){
            WebElement row = iterator.next();
            String rowText = row.getText();
            System.out.println("Row Text = " + rowText);
        }*/

        System.out.println("===Printing rows with less line===");
        Iterator<WebElement> iterator1 = rows.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next().getText());
        }

        System.out.println("===Printing columns===");
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='table1']//th"));
        System.out.println("number of columns" + columns.size());
        for (WebElement column : columns) {
            System.out.println(column.getText()+" ");
        }

        tearDown();
    }
}

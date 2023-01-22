package Class17_WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;

public class _04_TableWithoutTableTag02 {
    public static void main(String[] args) {
        setUp("https://demoqa.com/webtables");

        List<WebElement> columns = driver.findElements(By.xpath("//div[@class='rt-thead -header']/div/div"));
        int columnsSize = columns.size();
        System.out.println("number of columns: " + columnsSize);
        for (int i = 0; i < columnsSize; i++) {
            System.out.println(columns.get(i).getText());
        }

        List<WebElement> rows = driver.findElements(By.cssSelector("div.rt-tr-group"));
        int rowSize = rows.size();
        System.out.println(rowSize);

        for (WebElement row : rows) {
            if (!row.getText().isBlank() && !row.getText().isEmpty())
            {
                System.out.print(row.getText());
            }
        }


        tearDown();
    }
}

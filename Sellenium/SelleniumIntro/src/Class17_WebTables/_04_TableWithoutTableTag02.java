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



        WebElement addBtn = driver.findElement(By.cssSelector("button#addNewRecordButton"));
        addBtn.click();
        waitInSeconds(1);

        WebElement name = driver.findElement(By.cssSelector("#firstName"));
        name.sendKeys("Tju");
        WebElement lastName = driver.findElement(By.cssSelector("#lastName"));
        lastName.sendKeys("Cure");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("123@gmail.com");
        driver.findElement(By.cssSelector("#age")).sendKeys("32");
        driver.findElement(By.cssSelector("#salary")).sendKeys("30000");

        WebElement department = driver.findElement(By.cssSelector("#department"));
        department.sendKeys("tender");

        driver.findElement(By.cssSelector("#submit")).click();

        List<WebElement> rows1 = driver.findElements(By.cssSelector("div.rt-tr-group"));
        for (WebElement row : rows1) {
            if (!row.getText().isBlank() && !row.getText().isEmpty())
            {
                System.out.print(row.getText());
            }
        }

        tearDown();
    }
}

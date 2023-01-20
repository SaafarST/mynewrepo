package Class17_WebTables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;

import static utils.BaseClass.*;

public class _02_DynamicTable {
    public static void main(String[] args) {

        setUp("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='SampleTable']//tr"));
//        System.out.println("Number of rows: "+allRows.size());
//        for (WebElement row : allRows) {
//            System.out.println(row.getText());
//        }

        for (int i = 1; i < allRows.size(); i++) {
            System.out.println(allRows.get(i).getText());
        }

        List<WebElement> columns = driver.findElements(By.xpath("//table[@class='SampleTable']//tr[1]/th"));
        System.out.println("Columns size: " + columns.size());

        String expectedValue = "Charles Dodgeson";
        WebElement deleteBtn = driver.findElement(By.name("ctl00$MainContent$btnDelete"));

        String xpathForNamesRow = "//table[@class='SampleTable']//tr/td[2]";
        String xpathForBoxesRow = "//table[@class='SampleTable']//tr/td[1]";

        List<WebElement> nameRows = driver.findElements(By.xpath(xpathForNamesRow));
        List<WebElement> checkBoxes = driver.findElements(By.xpath(xpathForBoxesRow));

        for (int i = 1; i < nameRows.size(); i++) {
            if (nameRows.get(i).getText().contains(expectedValue)) {
                checkBoxes.get(i).click();
                deleteBtn.click();
                break;
            }
        }
        List<WebElement> allRowsAfterDeletion = driver.findElements(By.xpath("//table[@class='SampleTable']//tr"));
        int sizeAfterDeletion = allRowsAfterDeletion.size();
        System.out.println("Size before deletion: " + allRows.size());
        System.out.println("Size after deletion: " + sizeAfterDeletion);

        tearDown();
    }
}

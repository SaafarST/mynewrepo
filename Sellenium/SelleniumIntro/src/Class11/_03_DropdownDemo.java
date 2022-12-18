package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;


public class _03_DropdownDemo {
    public static void main(String[] args) throws InterruptedException {

        setUp();


        //Select class
         List<WebElement> countrySC = driver.findElements(By.cssSelector("//*[@name='country']/option"));
        for (WebElement element : countrySC) {
            if (element.getText().equals("Cuba"));
            element.click();
            break;
        }

        tearDown();
    }
}

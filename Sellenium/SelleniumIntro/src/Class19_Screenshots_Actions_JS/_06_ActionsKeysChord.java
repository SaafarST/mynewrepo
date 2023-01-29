package Class19_Screenshots_Actions_JS;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class _06_ActionsKeysChord {
    public static void main(String[] args) {
        setUp("https://google.com/");

        waitInSeconds(1);
        driver.findElement(By.name("q")).sendKeys("Exelenter Sdet");
        waitInSeconds(1);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        waitInSeconds(1);

        // another way to do above action
        driver.navigate().back();
        waitInSeconds(1);
        driver.findElement(By.name("q")).sendKeys("Exelenter sdet"+Keys.ENTER);
        waitInSeconds(1);

        // another way to do above action
        driver.navigate().back();
        waitInSeconds(1);
        driver.findElement(By.name("q")).sendKeys(Keys.chord("Exelenter sdet",Keys.ENTER));


        waitInSeconds(1);
        tearDown();
    }
}

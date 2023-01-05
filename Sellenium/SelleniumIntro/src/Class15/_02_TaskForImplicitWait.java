package Class15;
import org.openqa.selenium.By;

import static utils.BaseClass.*;

public class _02_TaskForImplicitWait {
    public static void main(String[] args) {
        setUp("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("http://www.uitestpractice.com/Students/Contact");
        driver.findElement(By.className("gNO89b")).submit();
        driver.findElement(By.xpath("/*[contains(text(),'Testing Controls - UI Automation Demo Site')]")).submit();


        tearDown();
    }
}

package Class14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

import static utils.BaseClass.*;

public class _04_Task {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://the-internet.herokuapp.com");
        driver.findElement(By.xpath("//*[contains(text(),'Multiple Windows')]")).click();

        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow+" , title "+driver.getTitle());

        for (int i = 0; i < 3; i++) {
            driver.findElement(By.xpath("//*[contains(text(),'Click Here')]")).click();

        }
        Set<String> allWindows = driver.getWindowHandles();
        for (String allWindow : allWindows) {
            driver.switchTo().window(allWindow);
            String title = driver.getTitle();
            System.out.println("title = " + title);
            driver.get("https://fb.com");
        }


        Thread.sleep(2000);
        tearDown();
    }
}

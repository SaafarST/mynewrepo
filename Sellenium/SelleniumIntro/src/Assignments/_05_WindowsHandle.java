package Assignments;

import org.openqa.selenium.By;

import java.util.Set;

import static utils.BaseClass.*;

public class _05_WindowsHandle {

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
            if (!allWindow.contains(parentWindow)) {
            driver.switchTo().window(allWindow);
            driver.get("https://fb.com");}
        }

        Thread.sleep(2000);
        tearDown();
    }
}

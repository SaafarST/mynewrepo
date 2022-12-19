package Class12;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;


//When alert is not handled
public class _00_alertDemo_UnhandledAlertException {
    public static void main(String[] args) throws InterruptedException {
        setUp();//https://selenium08.blogspot.com/2019/07/alert-test.html

        WebElement SimpleAlert = driver.findElement(By.cssSelector("[id='simple']"));
        SimpleAlert.click();

        WebElement ConfirmAlert = driver.findElement(By.cssSelector("[id='confirm']"));
        ConfirmAlert.click();
        Alert confirmAlert = driver.switchTo().alert();
        String confirmAlertText = confirmAlert.getText();
        System.out.println("confirmAlertText = " + confirmAlertText);
        confirmAlert.accept();

        tearDown();
    }
}

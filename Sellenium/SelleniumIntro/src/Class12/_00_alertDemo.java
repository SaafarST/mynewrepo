package Class12;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;
public class _00_alertDemo {
    public static void main(String[] args) throws InterruptedException {
        setUp();//https://selenium08.blogspot.com/2019/07/alert-test.html

        WebElement SimpleAlert = driver.findElement(By.cssSelector("[id='simple']"));
        SimpleAlert.click();
        Alert simpleAlert = driver.switchTo().alert();
        String simpleAlertText = simpleAlert.getText();
        System.out.println("simpleAlertText = " + simpleAlertText);
        simpleAlert.accept();
        
        Thread.sleep(2000);

        WebElement ConfirmAlert = driver.findElement(By.cssSelector("[id='confirm']"));
        ConfirmAlert.click();
        Alert confirmAlert = driver.switchTo().alert();
        String confirmAlertText = confirmAlert.getText();
        System.out.println("confirmAlertText = " + confirmAlertText);
        confirmAlert.accept();

        Thread.sleep(2000);

        ConfirmAlert.click();
        Alert confirmAlertNo = driver.switchTo().alert();
        String confirmAlertNoText = confirmAlertNo.getText();
        System.out.println("confirmAlertNoText = " + confirmAlertNoText);
        confirmAlert.dismiss();
        Thread.sleep(2000);

        //tearDown();
    }
}

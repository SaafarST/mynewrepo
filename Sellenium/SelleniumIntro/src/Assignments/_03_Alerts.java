package Assignments;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class _03_Alerts {
    //url=https://

    public static void main(String[] args) throws InterruptedException {

        setUp();

        WebElement alertSimple  = driver.findElement(By.xpath("(//*[contains(text(),'example')])[1]"));
        alertSimple.click();
        Thread.sleep(2000);
        Alert simpleAlert = driver.switchTo().alert();
        String simpleAlertText = simpleAlert.getText();
        System.out.println("Simple alert text: " + simpleAlertText);
        simpleAlert.accept();
        Thread.sleep(2000);

        WebElement alertConfirm  = driver.findElement(By.xpath("(//*[contains(text(),'example')])[2]"));
        alertSimple.click();
        Thread.sleep(2000);
        Alert confirmAlert = driver.switchTo().alert();
        String confirmAlertText = confirmAlert.getText();
        System.out.println("Confirm alert text: " + confirmAlertText);
        simpleAlert.accept();
        Thread.sleep(2000);
        alertSimple.click();
        Alert confirmAlertNo = driver.switchTo().alert();
        String confirmAlertNoText = confirmAlertNo.getText();
        System.out.println("Confirm alert text: " + confirmAlertNoText);
        simpleAlert.accept();

        tearDown();

    }
}

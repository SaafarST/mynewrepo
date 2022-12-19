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

        WebElement alertConfirm  = driver.findElement(By.xpath("(//*[contains(text(),'confirm')])[4]"));
        alertConfirm.click();
        Thread.sleep(2000);
        Alert confirmAlert = driver.switchTo().alert();
        String confirmAlertText = confirmAlert.getText();
        System.out.println("Confirm alert text: " + confirmAlertText);
        confirmAlert.accept();
        Thread.sleep(2000);

        WebElement alertConfirmNo  = driver.findElement(By.xpath("(//*[contains(text(),'confirm')])[4]"));
        alertConfirmNo.click();
        Alert confirmAlertNo = driver.switchTo().alert();
        String confirmAlertNoText = confirmAlertNo.getText();
        System.out.println("Confirm no alert text: " + confirmAlertNoText);
        simpleAlert.dismiss();

        WebElement alertPrompt = driver.findElement(By.xpath("(//*[contains(text(),'prompt')])[3]"));
        alertPrompt.click();
        Alert promptAlert = driver.switchTo().alert();
        String promptAlertText = promptAlert.getText();
        System.out.println("Prompt alert text = " + promptAlertText);
        promptAlert.sendKeys("Hello World");
        promptAlert.accept();

        tearDown();

    }
}

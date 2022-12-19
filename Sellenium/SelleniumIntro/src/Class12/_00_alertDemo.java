package Class12;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;
public class _00_alertDemo {
    public static void main(String[] args) throws InterruptedException {
        //Website used: https://selenium08.blogspot.com/2019/07/alert-test.html
        setUp();

        //Simple Alert
        WebElement SimpleAlert = driver.findElement(By.cssSelector("[id='simple']"));
        SimpleAlert.click();
        Alert simpleAlert = driver.switchTo().alert();
        String simpleAlertText = simpleAlert.getText();
        System.out.println("simpleAlertText = " + simpleAlertText);
        simpleAlert.accept();
        
        Thread.sleep(2000);

        //Confirm Alert:
        WebElement ConfirmAlert = driver.findElement(By.cssSelector("[id='confirm']"));
        ConfirmAlert.click();
        Alert confirmAlert = driver.switchTo().alert();
        String confirmAlertText = confirmAlert.getText();
        System.out.println("confirmAlertText = " + confirmAlertText);
        confirmAlert.accept();

        Thread.sleep(1000);


        ConfirmAlert.click();
        Alert confirmAlertNo = driver.switchTo().alert();
        String confirmAlertNoText = confirmAlertNo.getText();
        System.out.println("confirmAlertNoText = " + confirmAlertNoText);
        confirmAlert.dismiss();
        Thread.sleep(2000);

        //Prompt Alert:

        WebElement PromptAlert = driver.findElement(By.xpath("[id='prompt']"));
        PromptAlert.click();
        Alert promptAlert = driver.switchTo().alert();
        String promptAlertText = promptAlert.getText();
        System.out.println("promptAlertText = " + promptAlertText);
        promptAlert.sendKeys("Hello World");
        Thread.sleep(1000);
        promptAlert.accept();

        //tearDown();
    }
}

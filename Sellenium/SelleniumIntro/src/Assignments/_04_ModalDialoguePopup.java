package Assignments;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class _04_ModalDialoguePopup {
    //https://discord.com/channels/1002721597834149979/1002721598396170256/1053745403264241914
    public static void main(String[] args) throws InterruptedException {
        setUp();

        WebElement webElement = driver.findElement(By.cssSelector("[id='showLargeModal']"));
        webElement.click();
        String alertText = webElement.getText();

        System.out.println("Alert Text = " + alertText);
        WebElement webElement1 = driver.findElement(By.cssSelector("[id='example-modal-sizes-title-lg']"));
        String alertTitle = webElement1.getText();
        System.out.println("Alert Title = " + alertTitle);

       WebElement webElement2 = driver.findElement(By.xpath("//*[contains(text(),'Lorem')]"));
       String bodyText = webElement2.getText();
       System.out.println("Body text = " + bodyText);

       driver.findElement(By.cssSelector("[id='closeLargeModal']")).click();

       Thread.sleep(1000);

        tearDown();
    }
}

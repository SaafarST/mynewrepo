package Class16_DevelopersFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;

public class _02_RadioOrCheckboxTest2 {
    public static void main(String[] args) {
        setUp("https://demoqa.com/radio-button");
        WebElement noRadioBtn = driver.findElement(By.id("noRadio"));
        boolean noRadioBtnEnabled = noRadioBtn.isEnabled();
        System.out.println("noRadioBtnEnabled = " + noRadioBtnEnabled);

        clickRadioOrCheckbox(noRadioBtn);

        WebElement yesRadioBtn = driver.findElement(By.id("yesRadio"));
        //yesRadioBtn.click();
        clickRadioOrCheckbox(yesRadioBtn);
        clickButWaitForClickability(yesRadioBtn);


        tearDown();
    }

}

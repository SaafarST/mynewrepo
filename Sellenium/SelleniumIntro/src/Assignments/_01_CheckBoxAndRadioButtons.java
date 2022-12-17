package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static utils.BaseClass.*;

public class _01_CheckBoxAndRadioButtons {
    public static void main(String[] args) {
        setUp();
        //WebElement checkbox = driver.findElement(By.cssSelector("#content > ul > li:nth-child(6) > a"));
        WebElement checkboxes = driver.findElement(By.linkText("Checkboxes"));
        checkboxes.click();

        List<WebElement> Checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));

        for (int i = 0; i < Checkboxes.size(); i++) {
            System.out.println("Checkbox "+(i+1)+" is displayed ="+Checkboxes.get(i).isDisplayed() +
                    ", is enabled = " + Checkboxes.get(i).isEnabled() + ", is selected = " + Checkboxes.get(i).isSelected());
        }

        /*for (WebElement checkbox : Checkboxes) {
            System.out.println(checkbox.getText()+" is displayed= "+checkbox.isDisplayed()+", is selected= "+checkbox.isSelected()+", is enabled= "+checkbox.isEnabled());

        }*/


 /*       System.out.println("checkbox1.getText() = " + checkbox1.getText());

        WebElement checkbox2 = checkboxes.findElement(By.xpath("//*[@id=\"checkboxes\"]/text()[4]"));

        final boolean displayed_cb1 = checkbox1.isDisplayed();
        final boolean selected_cb1 = checkbox1.isSelected();
        final boolean enabled_cb1 = checkbox1.isEnabled();

        System.out.println("Checkbox 1 is displayed= "+displayed_cb1+", is selected= "+selected_cb1+", is enabled= "+enabled_cb1);
*/
        tearDown();


    }
}

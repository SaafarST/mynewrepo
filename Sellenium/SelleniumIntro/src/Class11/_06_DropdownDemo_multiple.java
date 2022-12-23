package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;


public class _06_DropdownDemo_multiple {
    public static void main(String[] args) throws InterruptedException {

        setUp("https://selenium08.blogspot.com/2019/11/dropdown.html");


        WebElement months = driver.findElement(By.cssSelector("select[name=Month]"));
        Select select = new Select(months);

        List<WebElement> montsList = select.getOptions();
        System.out.println("Total number pf months = " + montsList.size());

        //1st way:
//        for (WebElement month : montsList) {
//            if (month.getText().equals("March")||month.getText().equals("May")||month.getText().equals("September"))
//            month.click();
//        }

        //2nd way

        if (select.isMultiple()){
            select.selectByIndex(3);
            select.selectByVisibleText("May");
            select.selectByValue("Sept");
            Thread.sleep(2000);
            select.deselectByIndex(3);
            select.deselectAll();
        }


        tearDown();
    }
}

package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;


public class _04_DropdownDemo_Assignment {
    public static void main(String[] args) throws InterruptedException {

        setUp("https://selenium08.blogspot.com/2019/11/dropdown.html");

        WebElement countrySC = driver.findElement(By.cssSelector("select[name=country]"));
        Select select = new Select(countrySC);

        List<WebElement> countriesList = select.getOptions();
        System.out.println("Total number pf countries = " + countriesList.size());

        for (WebElement country:countriesList){
            country.click();
            Thread.sleep(30);
            if (country.getText().equals("Morocco")){
                System.out.println("Country "+country.getText()+" is found, test successful");
                country.click();
                break;}
        }

        Thread.sleep(1000);
        tearDown();
    }
}

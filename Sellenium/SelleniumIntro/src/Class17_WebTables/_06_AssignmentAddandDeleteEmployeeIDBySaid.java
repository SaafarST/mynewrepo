package Class17_WebTables;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.ConfigsReader;

import java.util.List;

import static utils.BaseClass.*;

public class _06_AssignmentAddandDeleteEmployeeIDBySaid {
/**
 * HW: Test Case: Add and then Delete added employee from the table
 * 1. Open Chrome Browser
 * 2. Navigate to URL www.exelentersdet.com
 * 3. Login to the website (Credentials are in your Properties file)
 * 4. Add an employee
 * 5. Verify employee has been added (By retrieving Employee ID).
 * 6. Go to Employee list
 * 7. Delete added employee (By employee ID - ID is unique, could be multiple employees with same name)
 * 8. Quit the browser
 */

    public static void loginToExelenter(String username, String password){
        sendText(driver.findElement(By.id("txtUsername")),username);
        sendText(driver.findElement(By.id("txtPassword")),password);
        click(driver.findElement(By.id("btnLogin")));
    }
    public static String addNewEmployee(String firstName,String middleName, String lastName){
        click(driver.findElement(By.id("menu_pim_viewPimModule")));//find PIM and click on it
        click(driver.findElement(By.cssSelector("input#btnAdd")));//Find Add btn and click);
        sendText(driver.findElement(By.id("firstName")),firstName);//set name to John
        sendText(driver.findElement(By.id("middleName")), middleName); //set middle name to Voltaire
        sendText(driver.findElement(By.id("lastName")), lastName); //set  surname to Bell
        String employeeID = getEmployeeID(driver.findElement(By.id("employeeId")),"value");//Store employeeID
        click(driver.findElement(By.id("btnSave")));//Click Save btn to add employee
        return employeeID;
    }
    public static List<WebElement> getList(String element){
        return driver.findElements(By.cssSelector(element));
    }
    static void verifyEmployee(String name, String middleName, String surname){

        WebElement personalTxtEmployeeId = driver.findElement(By.cssSelector("div#profile-pic h1"));
        if (personalTxtEmployeeId.getText().equals(name+" "+middleName+" "+surname)){
            System.out.println("Employee is added.");
        }else {
            System.out.println("Employee has not been added.");
        }

    }
    public static String getEmployeeID(WebElement element, String attribute){
        return element.getAttribute(attribute);
    }
    public static boolean clickEmployee(String employeeID, List<WebElement> listOfIDs, List<WebElement> listOfCBs){

        boolean status = false;
        try{
        for (int i = 0; i < listOfIDs.size(); i++) {
            if (listOfIDs.get(i).getText().equals(employeeID)) {
                System.out.println("An employee with ID of "+listOfIDs.get(i).getText()+" is on the list, and employee is clicked.");
                listOfCBs.get(i).click();
                waitInSeconds(5);
                status = true;
                break;
            }
        }
        }catch (Exception e){
            e.printStackTrace();
        }

        if(status == false){
            //System.out.println("An employee with ID of "+employeeID+" is not on the list.");
        }
        return status;
    }

    public static void main(String[] args) {
        /* 1. Open Chrome Browser
         * 2. Navigate to URL www.exelentersdet.com */

        setUp("https://www.exelentersdet.com");
        /* 3. Login to the website (Credentials are in your Properties file)*/
        loginToExelenter(ConfigsReader.getProperties("username"), ConfigsReader.getProperties("password"));

        click(driver.findElement(By.id("menu_pim_viewPimModule")));//Navigate to PIM

        String name = "Jack";
        String surname = "Bell";
        String middleName = "Voltaire";
        /* 4. Add an employee and get employee ID*/
        String employeeID = addNewEmployee(name, middleName, surname);//add new user and return ID

        /* 5. Verify employee has been added (By retrieving Employee ID).*/
        verifyEmployee(name, middleName, surname);

        click(driver.findElement(By.id("menu_pim_viewEmployeeList")));//Navigate to employee list to check user added or not
        waitInSeconds(1);

        //Delete added employee (By employee ID - ID is unique, could be multiple employees with same name)
        String expectedID = "0071";
        List<WebElement> rows = driver.findElements(By.cssSelector("div#tableWrapper tbody tr"));
        for (int i = 0; i < rows.size(); i++) {
            String ID = driver.findElement(By.cssSelector("table#resultTable tbody tr:nth-child(" + (i+1) + ") td:nth-child(2)")).getText();
            if (ID.equals(employeeID)){
                driver.findElement(By.cssSelector("table#resultTable tbody tr:nth-child("+i+") td:nth-child(1)")).click();
                waitInSeconds(1);
                WebElement deleteBtn = driver.findElement(By.id("btnDelete"));
                click(deleteBtn);
                WebElement dialogDeleteBtn = driver.findElement(By.id("dialogDeleteBtn"));//Dialogue delete Btn
                click(dialogDeleteBtn);
                System.out.println("Employee with ID of " + expectedID + " is successfully removed from the list.");
                break;
            }
        }

//        while (pageNumber < 6 && employeeFound == false) {
//            List<WebElement> listOfIDs = getList("tbody tr td:nth-child(2)");
//            List<WebElement> listOfCBs = getList("tbody tr td:nth-child(1)");
//            WebElement nextBtn = driver.findElement(By.xpath("(//*[contains(text(),'Next')])[1]"));
//
//            if (clickEmployee(expectedID, listOfIDs, listOfCBs)) {
//                waitInSeconds(4);
//                WebElement deleteBtn = driver.findElement(By.id("btnDelete"));
//                click(deleteBtn);
//                WebElement dialogDeleteBtn = driver.findElement(By.id("dialogDeleteBtn"));//Dialogue delete Btn
//                click(dialogDeleteBtn);
//                System.out.println("Employee with ID of " + expectedID + " is successfully removed from the list.");
//                employeeFound = true;
//                break;
//            } else {
//                try {
//                    if (pageNumber < 5) {
//                        System.out.println("Employee not found on list #" + (pageNumber+1) + ", switching to the next page.");
//                        System.out.println(" ================ ");
//                        click(nextBtn);
//                        pageNumber++;
//                    } else {
//                        System.out.println("An employee with ID of " + expectedID + " does not exist.");
//                        pageNumber++;
//                    }
//                }catch (Exception e)
//                {   e.printStackTrace();}
//            }
//        }
//    tearDown();
//}
//    public static WebElement get_ith_Element( List<WebElement> list, int i){
//    return list.get(i);
//}
//
//
//    public static int checkForValue( List<WebElement> list, String value){
//        int n_thElement = Integer.parseInt(null);
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getText().equals(value)){
//                n_thElement = i;
//                break;
//            }
//        }
//        return n_thElement;
    }
}

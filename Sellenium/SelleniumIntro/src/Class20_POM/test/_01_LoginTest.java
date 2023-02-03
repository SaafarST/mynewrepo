package Class20_POM.test;
import Class20_POM.pages._01_LoginPageWithoutPageFactory;
import utils.ConfigsReader;

import static utils.BaseClass.*;
public class _01_LoginTest {
    public static void main(String[] args) {
        setUp("https://exelentersdet.com/");

        var loginPage = new _01_LoginPageWithoutPageFactory();
        sendText(loginPage.username, ConfigsReader.getProperties("username"));
        sendText(loginPage.password,ConfigsReader.getProperties("password"));
        click(loginPage.loginBtn);

        tearDown();
    }
}

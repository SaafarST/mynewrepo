package Class14;
import org.openqa.selenium.WindowType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static utils.BaseClass.*;

public class _03_WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://demoqa.com/browser-windows");
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window = " + parentWindow);


        tearDown();
    }
}

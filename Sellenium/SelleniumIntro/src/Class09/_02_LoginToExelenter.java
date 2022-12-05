package Class09;

import java.io.FileInputStream;
import java.util.Properties;

public class _02_LoginToExelenter {
    public static void main(String[] args) {

        String filePath = System.getProperty("user.dir")+"/configs/configuration.properties";
        FileInputStream fis = new FileInputStream(filePath);
        Properties properties = new Properties();
        properties.load(fis);

    }
}

package utils.Lecture_;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReaderold {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir")+"/configs/configuration.properties";
        FileInputStream fis = new FileInputStream(filePath);
        Properties properties = new Properties();
        properties.load(fis);

        final String browser = properties.getProperty("browser");
        System.out.println("browser = " + browser);

    }
}

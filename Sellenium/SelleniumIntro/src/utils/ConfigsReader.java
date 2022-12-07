package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir")+"/configs/configuration.properties";
        FileInputStream fis = new FileInputStream(filePath);
        Properties properties = new Properties();
        properties.load(fis);

        final String browser = properties.getProperty("browser");
        System.out.println("browser = " + browser);

    }
    public static void loadProperties(String filePath) {

        try {
            FileInputStream fis = new FileInputStream(filePath);
            Properties properties = new Properties();
            properties.load(fis);
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

package Class09;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class _01_ConnectWithPropertierFile {
    public static void main(String[] args) throws IOException {

        //String filePath = "C:\\Users\\Nju\\Desktop\\SD\\OwnRepo\\mynewrepo\\Sellenium\\SelleniumIntro\\configs\\configuration.properties";
        String filePath = System.getProperty("user.dir")+"/configs/configuration.properties";
        System.out.println("filePath = " + filePath);

        String fullPath_forCSS = "C:\\Users\\Nju\\Desktop\\SD\\OwnRepo\\mynewrepo\\Sellenium\\SelleniumIntro\\src\\Class04\\cssDemo.java";
        System.out.println("fullPath_forCSS = " + fullPath_forCSS);

        String shortPath_forCSS =System.getProperty("user.dir")+"/src/Class04/cssDemo.java";
        System.out.println("shortPath_forCSS = " + shortPath_forCSS);

        FileInputStream fileInputStream = new FileInputStream(filePath);

        Properties properties = new Properties();
        properties.load(fileInputStream);




    }
}

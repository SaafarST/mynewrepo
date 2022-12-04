package Class09;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

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

         String url = properties.getProperty("url");
        System.out.println("url = " + url);

         String browser = properties.getProperty("browser");
        System.out.println("browser = " + browser);

        System.out.println("----values only----");
        final Collection<Object> values = properties.values();
        for(Object value:values){
            System.out.println("value = " + value);
        }
        System.out.println("----keys only----");
        final Set<Object> keys = properties.keySet();
        for(Object key:keys)
        {
            System.out.println("key = " + key);
        }

        final Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        for(Map.Entry<Object,Object> entry:entries){
            System.out.println(" " + entry);
        }

    }
}

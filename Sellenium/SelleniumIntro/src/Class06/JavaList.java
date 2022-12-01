package Class06;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

public class JavaList {
    public static void main(String[] args) {

    }
    public List<String> findElements(){
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Orange");
        return stringList;
    }
}

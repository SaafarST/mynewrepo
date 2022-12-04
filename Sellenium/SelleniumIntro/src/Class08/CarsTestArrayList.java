package Class08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CarsTestArrayList {
    public static void main(String[] args) {
        //Using ArrayList to store objects
        List<Cars> carsList = new ArrayList<>();
        carsList.add(new Tesla("Electricity"));
        carsList.add(new Toyota("Gasoline"));
        carsList.add(new Honda("Gasoline"));

        System.out.println("---Enhanced Loop---");
        for (Cars cars:carsList){
            cars.fuelType();
        }

        System.out.println("---For Loop---");
        for (int i = 0; i < carsList.size(); i++) {
            carsList.get(i).fuelType();
        }
        System.out.println("---Iterator Loop---");
         Iterator<Cars> iterator = carsList.iterator();
         while (iterator.hasNext()){
             iterator.next().fuelType();
         }
    }
}

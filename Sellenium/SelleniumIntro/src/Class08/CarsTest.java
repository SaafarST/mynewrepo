package Class08;

import java.util.Arrays;
import java.util.Iterator;

public class CarsTest {
    public static void main(String[] args) {
        //Regular way of storing objects in an array
        Cars[] carsArray = {new Toyota("gasoline"),
                new Honda("Gasoline"),
                new Tesla("Electricity")};

        System.out.println("---Enhanced Loop---");
        for (Cars car:carsArray){
            car.fuelType();
        }

        System.out.println("\n---For Loop---");
        for (int i = 0; i < carsArray.length; i++) {
            carsArray[i].fuelType();
        }

        System.out.println("\n---Iterator Loop");
        Iterator<Cars> iterator = Arrays.stream(carsArray).iterator();
        while (iterator.hasNext()){
            iterator.next().fuelType();
        }


    }
}

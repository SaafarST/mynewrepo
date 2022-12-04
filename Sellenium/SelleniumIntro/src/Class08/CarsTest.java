package Class08;

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

    }
}

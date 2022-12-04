package Class08;

public abstract class Cars {

    String fuelType;

    public Cars(String fuelType) {
        this.fuelType = fuelType;
    }

    abstract void fuelType();

}

class Toyota extends Cars{


    public Toyota(String fuelType) {
        super(fuelType);
    }

    @Override
    void fuelType() {
        System.out.println("Toyota's fuel is "+fuelType);
    }
}

class Honda extends Cars{

    public Honda(String fuelType) {
        super(fuelType);
    }

    @Override
    void fuelType() {
        System.out.println("Honda's fuel is "+fuelType);
    }
}

class Tesla extends Cars{

    public Tesla(String fuelType) {
        super(fuelType);
    }

    @Override
    void fuelType() {
        System.out.println("Tesla's fuel is "+fuelType);
    }
}
package Day51.Tohir.Tasks;

public class Travel {

    public String Weather;

    public static void main(String[] args) {
        traveltoOcean("HOT");
    }


    public static void traveltoOcean(String weather){
        if (weather.equals("HOT")){
            System.out.println("You may travel to Ocean");
        }else {
            throw new StringIndexOutOfBoundsException();
        }

    }

    public static void traveltoMountain(){}
}

package Day52.Tohir.Task2;

public class Applicaion {
    public static void main(String[] args) {
        Movie batman1 = new Movie("Batman Begins","2006-21-03");
        batman1.setBuyPrice(12.99);
        batman1.setRentPrice(1.99);
        System.out.println(batman1);
        Movie batman2 = new Movie("Batman Rises","2008-21-04");
        batman1.setBuyPrice(19.99);
        batman1.setRentPrice(2.99);
        System.out.println(batman2);
        Cinema Vatan = new Cinema();
        Vatan.addMovie(batman1);
        Vatan.addMovie(batman2);
        System.out.println(Vatan);
        //Vatan.addMovie(batman2);
        System.out.println(Vatan);

    }
}

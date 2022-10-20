package Day52.Tohir.Task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movie {
    private String Name;
    private LocalDate year_of_release;
    private double rent_price;
    private double buy_price;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getYear_of_release() {
        return year_of_release;
    }

    public void setYear_of_release(LocalDate year_of_release) {
        this.year_of_release = year_of_release;
    }

    public double getRent_price() {
        return rent_price;
    }

    public void setRent_price(int rent_price) {
        this.rent_price = rent_price;
    }

    public double getBuy_price() {
        return buy_price;
    }

    public void setBuy_price(int buy_price) {
        this.buy_price = buy_price;
    }

    public Movie(String name, String year_of_release) {
        Name = name;
        this.year_of_release = LocalDate.parse(year_of_release,DateTimeFormatter.ofPattern(" MM dd yyy"));
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Name='" + Name + '\'' +
                ", year_of_release=" + year_of_release +
                ", rent_price=" + rent_price +
                ", buy_price=" + buy_price +
                '}';
    }
}

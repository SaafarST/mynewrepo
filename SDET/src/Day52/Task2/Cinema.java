package Day52.Tohir.Task2;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
   private final ArrayList<Movie> list = new ArrayList<>();

    public void addMovie(Movie movie) {
        if (this.list.contains(movie))
        {
            throw new RuntimeException("Film already exists");

            }
        this.list.add(movie);
        }


    public void removeMovie(Movie movie) {
        this.list.remove(movie);
    }

    public List<Movie> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "list=" + list +
                '}';
    }
}

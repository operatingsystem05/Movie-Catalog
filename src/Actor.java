import java.util.ArrayList;
import java.util.List;

public class Actor
{
    private String name;
    private List<Movie> movies;

    public Actor(String name)
    {
        this.name = name;
        this.movies = new ArrayList<Movie>();
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Movie> getMovies()
    {
        return new ArrayList<>(movies);
    }

    public void addMovie(Movie movie)
    {
        if (!movies.contains(movie))
        {
            movies.add(movie);
        }
    }

    public void displayFilmography()
    {
        System.out.println("Filmography of " + name + ":");
        for (Movie movie : movies)
        {
            System.out.println(" - " + movie);
        }
    }
}
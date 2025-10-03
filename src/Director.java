import java.util.ArrayList;
import java.util.List;

public class Director
{
    private String name;
    private List<Movie> movies;

    public Director(String name)
    {
        this.name = name;
        this.movies = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public List<Movie> getMovies()
    {
        return new ArrayList<>(movies);
    }

    public void addMovie(Movie movie)
    {
        if (!movies.contains(movie)) {
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

    public void searchByGenre(String genre)
    {
        for (Movie movie : movies)
        {
            if (movie.getGenre().equalsIgnoreCase(genre))
            {
                System.out.println(" - " + movie);
            }
        }
    }

}
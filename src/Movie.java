import java.util.ArrayList;
import java.util.List;

public class Movie
{
    private String title;
    private String genre;
    private int releaseYear;
    private List<Actor> actors;

    public Movie(String title, String genre, int releaseYear)
    {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.actors = new ArrayList<>();
    }

    public String getTitle()
    {
        return title;
    }

    public String getGenre()
    {
        return genre;
    }

    public int getReleaseYear()
    {
        return releaseYear;
    }

    public void addActor(Actor actor)
    {
        if (!actors.contains(actor))
        {
            actors.add(actor);
            actor.addMovie(this);
        }
    }

    public List<Actor> getActors()
    {
        return new ArrayList<>(actors);
    }

    @Override
    public String toString()
    {
        return title + " (" + releaseYear + ") - " + genre;
    }
}
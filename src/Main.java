public class Main
{
    public static void main(String[] args)
    {
        Actor rosamund = new Actor("Rosamund Pike");
        Actor rooney = new Actor("Rooney Mara");
        Actor carrie = new Actor("Carrie Coon");
        Actor tilda = new Actor("Tilda Swinton");
        Actor saoirse = new Actor("Saoirse Ronan");
        Actor gwyneth = new Actor("Gwyneth Paltrow");
        Actor lupita = new Actor("Lupita Nyong’o");

        Movie goneGirl = new Movie("Gone Girl", "Mystery", 2014);
        goneGirl.addActor(rosamund);
        goneGirl.addActor(carrie);

        Movie girlWithDragonTattoo = new Movie("The Girl with the Dragon Tattoo", "Crime", 2011);
        girlWithDragonTattoo.addActor(rooney);

        Movie theGrandBudapestHotel = new Movie("The Grand Budapest Hotel", "Comedy", 2014);
        theGrandBudapestHotel.addActor(tilda);
        theGrandBudapestHotel.addActor(saoirse);

        Movie theRoyalTenenbaums = new Movie("The Royal Tenenbaums", "Comedy/Drama", 2001);
        theRoyalTenenbaums.addActor(gwyneth);

        Movie us = new Movie("Us", "Horror", 2019);
        us.addActor(lupita);

        Director fincher = new Director("David Fincher");
        fincher.addMovie(goneGirl);
        fincher.addMovie(girlWithDragonTattoo);

        Director anderson = new Director("Wes Anderson");
        anderson.addMovie(theGrandBudapestHotel);
        anderson.addMovie(theRoyalTenenbaums);

        Director peele = new Director("Jordan Peele");
        peele.addMovie(us);

        fincher.displayFilmography();
        System.out.println();
        anderson.displayFilmography();
        System.out.println();
        peele.displayFilmography();

        fincher.searchByGenre("Mystery");

        System.out.println();
        rosamund.displayFilmography();
        rooney.displayFilmography();
        tilda.displayFilmography();
        lupita.displayFilmography();
    }
}
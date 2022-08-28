package Movies;

public class Studio {

    public void makeMovies() {
        Movie firstMovie = new Horror();
        firstMovie.setLengthInMinutes(12);
        firstMovie.setTitle("Plutea o ranga pe Siret");

        Movie secondMovie = new Horror();
        secondMovie.setLengthInMinutes(62);
        secondMovie.setTitle("Ca toporul la fund");

        Movie thirdMovie = new Comedy();
        thirdMovie.setLengthInMinutes(83);
        thirdMovie.setTitle("I was a world swiming champion");

        Cinema cinema = new Cinema();
        cinema.addMovie(firstMovie);
        cinema.addMovie(secondMovie);
        cinema.addMovie(thirdMovie);

        cinema.displayMovies();
    }
}

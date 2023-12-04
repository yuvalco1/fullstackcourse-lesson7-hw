import java.util.Date;

public class Movie {

    public final String title;

    public final Date date;

    public double rating;

    public String genre;

    public static int movieCounter=1;

    public final int ratingForOscar=9;

    public Movie(String title, Date date, double rating, String genre, int movieCounter) {
        this.title = title;
        this.date = date;
        this.rating = rating;
        this.genre = genre;
        this.movieCounter = movieCounter;

    }

    // create toString method
    public String toString(){
        return "The title is " + this.title + " and the date is " + this.date + " and the rating is " + this.rating + " and the genre is " + this.genre + " and the movie counter is " + this.movieCounter;
    }

    // create method to reset movieCounter
    public void resetMovieCounter(){
        this.movieCounter = 1;
    }

    // create method to check if movie is eligible for Oscar
    public boolean isEligibleForOscar(){
            if (this.rating >= this.ratingForOscar){
                return true;
            } else {
                return false;
            }
        }



}

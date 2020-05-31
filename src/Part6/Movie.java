package Part6;

public class Movie {

    private String title;
    private double rating;

    Movie(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

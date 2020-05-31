package Part6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Movie[] movieArray = new Movie[10];
        double maxRating = 0;
        Movie bestMovie = movieArray[0];

        for (int i = 0; i < movieArray.length; i++) {
            movieArray[i] = new Movie("Movie" + i, random.nextInt(10));
            if (movieArray[i].getRating() > maxRating) {
                maxRating = movieArray[i].getRating();
                bestMovie = movieArray[i];
            }
        }
        System.out.println("Best rated movie is " + bestMovie.getTitle());
    }
}

package exercise4_2;

import java.util.Comparator;

class RatingCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        String ratingL = String.valueOf(left.getRating());
        String ratingR = String.valueOf(right.getRating());
        int count = Integer.max(ratingL.length() - ratingL.indexOf("."), ratingR.length() - ratingR.indexOf("."));
        return (int) (left.getRating() * Math.pow(10, count) - right.getRating() * Math.pow(10, count));
    }
}

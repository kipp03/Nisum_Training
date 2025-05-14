import java.util.*;

class Movie {
    String title, director, genre;
    int year;
    double rating;

    Movie(String title, String director, String genre, int year, double rating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    public String toString() {
        return String.format("%-20s %-15s %-10s %4d  %.1f", title, director, genre, year, rating);
    }
}

public class MovieCollectionManager {
    static ArrayList<Movie> movieList = new ArrayList<>();

    public static void main(String[] args) {
        addMovie("Inception", "Nolan", "Sci-Fi", 2010, 8.8);
        addMovie("Interstellar", "Nolan", "Sci-Fi", 2014, 8.6);
        addMovie("The Godfather", "Coppola", "Crime", 1972, 9.2);

        System.out.println("All Movies:");
        displayMovies(movieList);

        System.out.println("\nMovies by genre 'Sci-Fi':");
        filterByGenre("Sci-Fi");

        System.out.println("\nSorted by rating:");
        sortByRating();
        displayMovies(movieList);
    }

    static void addMovie(String title, String director, String genre, int year, double rating) {
        movieList.add(new Movie(title, director, genre, year, rating));
    }

    static void removeMovie(String title) {
        movieList.removeIf(movie -> movie.title.equalsIgnoreCase(title));
    }

    static void filterByGenre(String genre) {
        for (Movie m : movieList) {
            if (m.genre.equalsIgnoreCase(genre)) {
                System.out.println(m);
            }
        }
    }

    static void sortByTitle() {
        movieList.sort(Comparator.comparing(m -> m.title));
    }

    static void sortByYear() {
        movieList.sort(Comparator.comparingInt(m -> m.year));
    }

    static void sortByRating() {
        movieList.sort((a, b) -> Double.compare(b.rating, a.rating));
    }

    static void displayMovies(List<Movie> movies) {
        System.out.printf("%-20s %-15s %-10s %-5s %-6s\n", "Title", "Director", "Genre", "Year", "Rating");
        for (Movie m : movies) {
            System.out.println(m);
        }
    }
}

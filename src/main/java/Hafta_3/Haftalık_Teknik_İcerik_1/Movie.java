package Hafta_3.Haftalık_Teknik_İcerik_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Movie {
    public String movieName;
    public int yearOfPub;
    public String movieGenre;
    public double imdb;

    public Movie(String movieName, int yearOfPub, String movieGenre, double imdb) {
        this.yearOfPub = yearOfPub;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.imdb = imdb;
    }

    public String getMovieName() {
        return movieName;
    }
    public int getYearOfPub() {
        return yearOfPub;
    }
    public String getMovieGenre() {
        return movieGenre;
    }
    public double getImdb() {
        return imdb;
    }

    @Override
    public String toString() {
        return "Film Adı : " + movieName + "\n" +
                "Yayın Yılı : " + yearOfPub + "\n" +
                "Film Türü : " + movieGenre + "\n" +
                "İMDB : " + imdb + "\n" +
                "-----------------------------------";
    }

    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>(5);
        movies.add(new Movie("SEVEN", 1995, "Suç", 8.6));
        movies.add(new Movie("SHUTTER ISLAND", 2010, "Gerilim", 8.2));
        movies.add(new Movie("THE PLATFORM", 2019, "Korku", 7));
        movies.add(new Movie("THE WOLF OF WALL STREET", 2013, "Komedi", 8.2));
        movies.add(new Movie("BERGEN", 2022, "Dram", 6.9));

        System.out.println("İMDB Puanına göre sıralama : ");
        System.out.println("");
        movies.sort(Comparator.comparingDouble(Movie::getImdb).reversed());
        for (Movie movie : movies){
            System.out.println(movie);
        }

        System.out.println("-----------------------------------");
        System.out.println("Yayın Yılına göre sıralama : ");
        System.out.println("");
        movies.sort(Comparator.comparingInt(Movie::getYearOfPub));
        for (Movie movie : movies){
            System.out.println(movie);
        }

        String selectedGenre = "Suç";
        System.out.println("-----------------------------------");
        System.out.println("Film Türü : " + selectedGenre);
        System.out.println("");
        List<Movie> filteredMovies = movies.stream().filter(movie -> movie.getMovieGenre().equalsIgnoreCase(selectedGenre)).collect(Collectors.toList());
        if (filteredMovies.isEmpty()) {
            System.out.println(selectedGenre + " türünde bir film bulunamadı!");
        } else {
            for (Movie movie : filteredMovies) {
                System.out.println(movie);
            }
        }
    }
}

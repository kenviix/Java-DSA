package TCS;


/*

## Problem Statement

Create class Movie with below attributes:
movieName - String
company - String
genre - String
budget - int

Create class Solution and implement static method "getMovieByGenre" in the Solution class.
This method will take array of Movie objects and a searchGenre String as parameters.
And will return another array of Movie objects where the searchGenre String matches with the original array of Movie object's genre attribute (case insensitive search).

Write necessary getters and setters.

Before calling "getMovieByGenre" method in the main method, read values for four Movie objects referring the attributes in above sequence along with a String searchGenre.
Then call the "getMovieByGenre" method and write logic in main method to print "High Budget Movie",if the movie budget attribute is greater than 80000000 else print "Low Budget Movie".

## Input

    aaa
    Marvel
    Action
    250000000
    bbb
    Marvel
    Comedy
    25000000
    ccc
    Marvel
    Comedy
    2000000
    ddd
    Marvel
    Action
    300000000
    Action

## Output

    High Budget Movie
    High Budget Movie


 */

import java.util.Arrays;
import java.util.Scanner;

public class MovieGenre {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Movies[] movies = new Movies[4];
        for (int i = 0; i < movies.length; i++) {
            movies[i] = new Movies(in.next(),in.next(),in.next(),in.nextInt());
        }
        String genre = in.next();
        in.close();

        Movies[] moviesByGenre = getMovieByGenre(movies,genre);
        for (Movies movie:moviesByGenre){
            if(movie.getBudget()>80000000){
                System.out.println("High Budget Movie");
            }else {
                System.out.println("Low Budget Movie");
            }
        }
    }

    static Movies[] getMovieByGenre(Movies[] movies,String searchGenre){
        Movies[] movieByGenre = new Movies[0];
        for(Movies movie:movies){
            if(movie.getGenre().toLowerCase().equalsIgnoreCase(searchGenre)){
                movieByGenre = Arrays.copyOf(movieByGenre,movieByGenre.length + 1);
                movieByGenre[movieByGenre.length - 1] = movie;
            }
        }
        return movieByGenre;
    }

}

class Movies{
    String movieName;
    String company;
    String genre;
    int budget;

    public String getGenre() {
        return genre;
    }

    public int getBudget() {
        return budget;
    }

    public Movies(String movieName, String company, String genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }
}

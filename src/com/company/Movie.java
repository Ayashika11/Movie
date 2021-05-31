package com.company;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String studio;
    private String rating;
    public Movie(String title,String studio,String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    public Movie(String title,String studio){
        this.title=title;
        this.studio=studio;
        rating="PG";
    }
    public Movie[] getPG(Movie[] movies){
        ArrayList<Movie> pgMovies = new ArrayList<>();
        for(Movie movie:movies){
            if(movie.rating.contains("PG")){
                pgMovies.add(movie);
            }
        }
         return pgMovies.toArray(new Movie[pgMovies.size()]);
    }

    public static void main(String[] args) {
        Movie obj1 = new Movie("Casino Royale","Eon Productions","PG-13");
        Movie obj2 = new Movie("The Father","F comme Film Trademark Films","R");
        Movie obj3 = new Movie("Tenet","Warner Bros","PG-13");
        Movie obj4 = new Movie("The Ring","MacDonald Productions BenderSpink","R");
        Movie obj5 = new Movie("Nomadland","Universal");
        Movie obj6 = new Movie("Deadly illusion","Universal");
        Movie[] movies={obj1,obj2,obj3,obj4,obj5,obj6};
        Movie[] pgMovies= movies[0].getPG(movies);
        for(Movie movie:pgMovies){
            System.out.println(movie.title);
        }
    }
}

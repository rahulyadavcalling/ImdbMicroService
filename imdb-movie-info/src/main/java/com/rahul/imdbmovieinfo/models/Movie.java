package com.rahul.imdbmovieinfo.models;

public class Movie {

    private String movieID;
    private String name;

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }


    public Movie(String movieID, String name) {
        this.name = name;
        this.movieID = movieID;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.rahul.imdbreplica.models;

public class Ratings {
    public Ratings(){

    }

    private String movieID;

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    private int rating;

    public Ratings(String movieID, int rating) {
        this.movieID = movieID;
        this.rating = rating;
    }
}

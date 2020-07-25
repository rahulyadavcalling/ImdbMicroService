package com.rahul.imdbreplica.models;

import java.util.List;

public class userRating {
    public userRating() {

    }

    public List<Ratings> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<Ratings> userRating) {
        this.userRating = userRating;
    }

    public userRating(List<Ratings> userRating) {
        this.userRating = userRating;
    }

    private List<Ratings> userRating;
}

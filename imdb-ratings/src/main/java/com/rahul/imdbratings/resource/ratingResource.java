package com.rahul.imdbratings.resource;

import com.rahul.imdbratings.models.Ratings;
import com.rahul.imdbratings.models.userRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class ratingResource {
    @RequestMapping("/{movieID}")
    public Ratings getRating(@PathVariable("movieID") String movieID){
        return new Ratings(movieID, 3);
    }

    @RequestMapping("/users/{userID}")
    public userRating getUserRating(@PathVariable("userID") String userID){

        List<Ratings> ratings = Arrays.asList(
                new Ratings("1234",4),
                new Ratings("12345",5)
        );
        userRating userRating = new userRating();
        userRating.setUserRating(ratings);
       return  userRating;
    }
}

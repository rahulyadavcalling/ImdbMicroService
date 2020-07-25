package com.rahul.imdbmovieinfo.resources;

import com.rahul.imdbmovieinfo.models.Movie;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class movieResource {
    @RequestMapping("/{movieID}")
    public Movie getMovieInfo(@PathVariable("movieID") String movieID){
        return new Movie(movieID, "Test Name");
    }
}

package com.rahul.imdbreplica.resources;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.rahul.imdbreplica.models.CatalogItem;
import com.rahul.imdbreplica.models.Movie;
import com.rahul.imdbreplica.models.Ratings;
import com.rahul.imdbreplica.models.userRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class imdbReplicaResource {

    @Autowired
    private RestTemplate getRestTemplate;

    @RequestMapping("/{userID}")
    @HystrixCommand(defaultFallback = "getFallbackCatalog")
    public List<CatalogItem> getCatolog(@PathVariable("userID") String userID){

        //Get all rated movie ID
        userRating ratings = getRestTemplate.getForObject("http://MOVIERATINGSERVICE/ratings/users/"+ userID, userRating.class);

        return ratings.getUserRating().stream().map( rating -> {
            Movie movie = getRestTemplate.getForObject("http://MOVIEINFOSERVICE/movies/" + rating.getMovieID(), Movie.class);
            return new CatalogItem(movie.getName(), "Koi Mil Gaya", rating.getRating());
        })
        .collect(Collectors.toList());

      /*  return Collections.singletonList(
          new CatalogItem("Jadoo", "Koi Mil gaya", 4)
        );*/
    }

    public List<CatalogItem> getFallbackCatalog(@PathVariable("userID") String userID) {
        return Arrays.asList(new CatalogItem("No Movie", "",0));
    }
    }
}

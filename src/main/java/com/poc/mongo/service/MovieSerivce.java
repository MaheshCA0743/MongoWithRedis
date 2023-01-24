package com.poc.mongo.service;

import com.poc.mongo.model.Movie;
import com.poc.mongo.repo.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieSerivce {
    @Autowired
    MovieRepository movieRepository;

    @Autowired
    private SampleService sampleService;


    //@Cacheable(value = "Movie")
    public Optional<Movie> getMovieByName(String name){
        System.out.println("Entered MovieService");
       // return movieRepository.findByName(name);


        return sampleService.getMovieByName(name);
    }
}

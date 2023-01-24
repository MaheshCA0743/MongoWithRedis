package com.poc.mongo.service;

import com.poc.mongo.model.Movie;
import com.poc.mongo.repo.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class SampleService {

    @Autowired
    private MovieRepository movieRepository;

    //@Cacheable(value= "Movie")
    public Optional<Movie> getMovieByName(String name){
        System.out.println("Entered SampleService");

        return movieRepository.findByName(name);
    }
}

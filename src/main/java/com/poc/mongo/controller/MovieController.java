package com.poc.mongo.controller;

import com.poc.mongo.model.Movie;
import com.poc.mongo.repo.MovieRepository;
import com.poc.mongo.service.MovieSerivce;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@EnableCaching
public class MovieController {
    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private MovieSerivce movieSerivce;

    @PostMapping("/movies")
    public Movie createMovie(@RequestBody Movie movie) {

        return movieRepository.save(movie);
    }

    @GetMapping("/movies/{name}")
    public Optional<Movie> getMovieByName(@PathVariable String name) {
        return movieSerivce.getMovieByName(name);
    }
}

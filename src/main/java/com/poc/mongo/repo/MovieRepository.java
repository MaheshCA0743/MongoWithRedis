package com.poc.mongo.repo;

import com.poc.mongo.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface MovieRepository extends MongoRepository<Movie,String> {
    Optional<Movie> findByName(String name);
}

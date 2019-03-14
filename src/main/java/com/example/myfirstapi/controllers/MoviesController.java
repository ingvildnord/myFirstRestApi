package com.example.myfirstapi.controllers;

import com.example.myfirstapi.models.Movies;
import com.example.myfirstapi.repositories.MoviesRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesController  {

    @Autowired
    private MoviesRepository repository;

    //GET Methods
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Movies> getAllMovies() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{_id}", method = RequestMethod.GET)
    public Movies getMovieById(@PathVariable("_id") ObjectId _id) {
        return repository.findBy_id(_id);
    }

    @RequestMapping(value = "/{_title}", method = RequestMethod.GET)
    public Movies getMovieByTitle(@PathVariable("title") String title) {
        //todo proper method
        /*repository.findBy_id(title);*/
        return null;
    }

}

package com.example.myfirstapi.controllers;

import com.example.myfirstapi.models.nrkShows;
import com.example.myfirstapi.repositories.ShowsRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/shows")
public class ShowsController {

    @Autowired
    private ShowsRepository repository;

    //CRUD FUNCTIONS

    //GET Methods
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<nrkShows> getAllShows() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{_id}", method = RequestMethod.GET)
    public nrkShows getShowsById(@PathVariable("_id") ObjectId _id) {
        return repository.findBy_id(_id);
    }

    //Todo experiment with returns
    @RequestMapping(value = "/joined", method = RequestMethod.GET)
    public List<nrkShows>  getAllJoinedShows() {
       return repository.findAll();
    }

    //POST Methods
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public nrkShows createShow(@Valid @RequestBody nrkShows shows) {
        shows.set_id(ObjectId.get());
        repository.save(shows);
        return shows;
    }

}

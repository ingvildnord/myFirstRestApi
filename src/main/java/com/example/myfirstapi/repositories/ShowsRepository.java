package com.example.myfirstapi.repositories;

import com.example.myfirstapi.models.nrkShows;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Connection between model and database, here MongoDB.
 * note: Should be possible to easily create other repositories to connect to other database solutions
 * */
@Repository
public interface ShowsRepository extends MongoRepository<nrkShows, String> {
    nrkShows findBy_id(ObjectId _id);
    //note: stupid naming conventions causing stupid exceptions. Wouldn't run cause method was named findById().
}

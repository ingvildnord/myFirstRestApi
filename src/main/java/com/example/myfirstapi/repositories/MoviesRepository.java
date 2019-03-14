package com.example.myfirstapi.repositories;

import com.example.myfirstapi.models.Movies;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends MongoRepository<Movies, String> {
    Movies findBy_id(ObjectId _id);
}

package com.codecamp.movies.repository;

import com.codecamp.movies.model.Trivia;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TriviaRepository extends MongoRepository<Trivia, ObjectId> {
}

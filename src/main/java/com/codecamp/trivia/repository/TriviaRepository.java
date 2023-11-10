package com.codecamp.trivia.repository;

import com.codecamp.trivia.model.Trivia;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TriviaRepository extends MongoRepository<Trivia, ObjectId> {

    public List<Trivia> findAll();
}

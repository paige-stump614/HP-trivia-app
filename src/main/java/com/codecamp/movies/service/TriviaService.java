package com.codecamp.movies.service;

import com.codecamp.movies.model.Trivia;
import com.codecamp.movies.repository.TriviaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TriviaService {
    private TriviaRepository triviaRepository;

    public TriviaService(TriviaRepository triviaRepository) {
        this.triviaRepository = triviaRepository;
    }

    public List<Trivia> getAllQuestions() {
        return triviaRepository.findAll();
    }

}

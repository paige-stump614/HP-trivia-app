package com.codecamp.trivia.service;

import com.codecamp.trivia.model.Trivia;
import com.codecamp.trivia.repository.TriviaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

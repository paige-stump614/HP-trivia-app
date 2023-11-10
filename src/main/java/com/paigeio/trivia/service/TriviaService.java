package com.paigeio.trivia.service;

import com.paigeio.trivia.model.Trivia;
import com.paigeio.trivia.repository.TriviaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TriviaService {
    private TriviaRepository triviaRepository;

    public TriviaService(TriviaRepository triviaRepository) {
        this.triviaRepository = triviaRepository;
    }

    public List<Trivia> getAllQuestions() {
        System.out.println("in service");
        List<Trivia> trivias = triviaRepository.findAll();
        return triviaRepository.findAll();
    }

}

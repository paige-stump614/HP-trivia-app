package com.codecamp.movies.controller;

import com.codecamp.movies.model.Trivia;
import com.codecamp.movies.service.TriviaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/trivia")
public class TriviaController {
    private TriviaService triviaService;

    public TriviaController(TriviaService triviaService){
        this.triviaService = triviaService;
    }

    @GetMapping
    public ResponseEntity<List<Trivia>> getAllQuestions() {
        return new ResponseEntity<List<Trivia>>(triviaService.getAllQuestions(), HttpStatus.OK);
    }
}

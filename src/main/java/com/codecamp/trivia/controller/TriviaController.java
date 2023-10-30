package com.codecamp.trivia.controller;

import com.codecamp.trivia.model.Trivia;
import com.codecamp.trivia.service.TriviaService;
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

package com.paigeio.trivia.controller;

import com.paigeio.trivia.model.Trivia;
import com.paigeio.trivia.service.TriviaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/trivia")
public class TriviaController {
    private TriviaService triviaService;

    public TriviaController(TriviaService triviaService){
        this.triviaService = triviaService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Trivia>> getAllQuestions() {
        System.out.println("in endpoint");
        return new ResponseEntity<List<Trivia>>(triviaService.getAllQuestions(), HttpStatus.OK);
    }

    @PostMapping(value = "/submitQuestion")
    public void submitQuestion() {
        System.out.println("you hit the backend");
    }
}

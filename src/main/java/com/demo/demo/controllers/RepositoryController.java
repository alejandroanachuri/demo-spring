package com.demo.demo.controllers;

import com.demo.demo.domains.Tutorial;
import com.demo.demo.repositories.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alejandro Anachuri
 * @version 1.0
 * @description <p>Repository Controller</p>
 * @date 2022-07-22 15:42
 **/
@RestController
@RequestMapping("/api/v1.0/")
public class RepositoryController {
    @Autowired
    TutorialRepository tutorialRepository;

    @GetMapping("/tutorials")
    public ResponseEntity<List<Tutorial>> getAllTutorials() {
        List<Tutorial> tutorials = new ArrayList<>();
        tutorialRepository.findAll().forEach(tutorials::add);
        return new ResponseEntity<>(tutorials, HttpStatus.OK);
    }

    @PostMapping("/tutorials")
    public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
        Tutorial newTutorial = tutorialRepository.save(tutorial);
        return new ResponseEntity<>(newTutorial, HttpStatus.CREATED);
    }
}

package com.example.Api_de_filmes.controller;

import com.example.Api_de_filmes.movieDTO.MovieDTO;
import com.example.Api_de_filmes.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movie/title")
    public ResponseEntity<String> getMovieByTitle(@RequestParam String title) {
        String movie = movieService.getMovieByTitle(title);
        return ResponseEntity.ok(movie);
    }
}

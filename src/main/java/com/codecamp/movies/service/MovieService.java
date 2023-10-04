package com.codecamp.movies.service;

import com.codecamp.movies.model.Movie;
import com.codecamp.movies.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getSingleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}

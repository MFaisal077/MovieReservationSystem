package dev.faisal.Movie.reservation.mainApp.Controllers;

import dev.faisal.Movie.reservation.mainApp.model.Movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import dev.faisal.Movie.reservation.mainApp.Repository.MovieRepository;

import org.springframework.web.bind.annotation.*;

@Controller
public class MoviesControllers {


    @Autowired
    private MovieRepository movieRepository;

    @PostMapping("/movies")
    public @ResponseBody Movies addMovie(@RequestBody Movies movie) {
        return movieRepository.save(movie);  // not repository.save()
    }

    @GetMapping("/movies")
    public @ResponseBody Iterable<Movies> getMovies() {
        return movieRepository.findAll();
    }

}

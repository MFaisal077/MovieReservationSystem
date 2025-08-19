package dev.faisal.Movie.reservation.mainApp.Repository;

import org.springframework.data.repository.CrudRepository;

import dev.faisal.Movie.reservation.mainApp.model.Movies;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface MovieRepository extends CrudRepository<Movies, Integer> {

}
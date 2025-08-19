package dev.faisal.Movie.reservation.mainApp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Movies {



    private String Name;
    private String Genre;
    private String Year;
    private String Director;
    private String Rating;
    @Id
    @GeneratedValue()
    private Integer id;


    public Movies(String Name, String Genre, String Year, String Director, String Rating) {
        this.Name = Name;
        this.Genre = Genre;
        this.Year = Year;
        this.Director = Director;
        this.Rating = Rating;
    }


    public Movies() {}
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

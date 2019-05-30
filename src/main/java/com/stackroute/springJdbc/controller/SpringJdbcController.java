package com.stackroute.springJdbc.controller;

import com.stackroute.springJdbc.domain.Movie;
import com.stackroute.springJdbc.repository.SpringJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpringJdbcController {
    @Autowired
    private SpringJdbcRepository springJdbcRepository;

    public ResponseEntity<String> executeShow() {
        Movie entity = springJdbcRepository.get("3");
        return new ResponseEntity("Movie: " + entity.getMovieId()
                + ", " + entity.getMovieName()+ "," + entity.getActorsName() + "," + entity.getReleaseYear() + "," + entity.getRatings(), HttpStatus.OK);
    }

    public ResponseEntity<String> insert() {
        Movie entity = new Movie(7,"DDLJ","kajol",1995,(float)4.9);
        springJdbcRepository.add(entity);
        return new ResponseEntity("Movie Add: " + entity.getMovieId()
                + ", " + entity.getMovieName() + "," + entity.getActorsName() + "," + entity.getReleaseYear() + "," + entity.getRatings(), HttpStatus.OK);
    }

    public ResponseEntity<String> read() {
        Movie entity = springJdbcRepository.get("3");
        return new ResponseEntity("Movie Get: " + entity.getMovieId()
                + ", " + entity.getMovieName()  + "," + entity.getActorsName() + "," + entity.getReleaseYear() + "," + entity.getRatings(), HttpStatus.OK);
    }

    public ResponseEntity<String> update() {
        Movie entity = new Movie(3,"lucifer","Mohanlal",2019,(float)5);
        springJdbcRepository.update(entity);
        return new ResponseEntity("Movie Update: " + entity.getMovieId()
                + ", " + entity.getMovieName()  + "," + entity.getActorsName() + "," + entity.getReleaseYear() + "," + entity.getRatings(), HttpStatus.OK);
    }

    public ResponseEntity<String> delete() {
        Movie entity = new Movie(5,"DDLJ","kajol",1995,(float)4.9);
        springJdbcRepository.delete(entity);
        return new ResponseEntity("Movie Delete: " + entity.getMovieId()
                + ", " + entity.getMovieName()  + "," + entity.getActorsName() + "," + entity.getReleaseYear() + "," + entity.getRatings(), HttpStatus.OK);
    }
    public ResponseEntity<?> getAll() {
        List<Movie> movieList =springJdbcRepository.getAll();
        return new ResponseEntity<List<Movie>>(movieList,HttpStatus.OK);
    }
}

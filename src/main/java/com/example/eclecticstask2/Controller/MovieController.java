package com.example.eclecticstask2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovieController {
    @GetMapping(value = "/allMovies")
    public String allMovies (){
        return "movies";
    }


    @GetMapping(value="/watched")
    public String watched(){
        return "watched-movies";
    }

    @PostMapping(value = "/add-movies")
    public String addMovies(){
        return "add Movies now";
    }

    @PostMapping(value = "/delete-movies")
    public String deleteMovies(){
        return "delete movies";
    }
}

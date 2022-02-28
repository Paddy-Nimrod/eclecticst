package com.example.eclecticstask2.Models;

@Document("movies")

public class MovieModel {
    @Id
    private String id;

    private String movieName;

    private Long duration;

    private Long releaseDate;


}

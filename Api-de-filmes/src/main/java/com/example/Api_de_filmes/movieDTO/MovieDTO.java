package com.example.Api_de_filmes.movieDTO;

public class MovieDTO {
    private String title;
    private String year;
    private String plot;

    public MovieDTO(String title, String year, String plot) {
        this.title = title;
        this.year = year;
        this.plot = plot;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getPlot() {
        return plot;
    }
}

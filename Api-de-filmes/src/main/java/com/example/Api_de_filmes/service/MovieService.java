package com.example.Api_de_filmes.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieService {
    private final String API_KEY = "46b7ed01"; // Substitua pela sua chave da API
    private final String BASE_URL = "http://www.omdbapi.com/";

    public String getMovieByTitle(String title) {
        RestTemplate restTemplate = new RestTemplate();
        String url = BASE_URL + "?t=" + title + "&apikey=" + API_KEY;
        return restTemplate.getForObject(url, String.class);
    }
}

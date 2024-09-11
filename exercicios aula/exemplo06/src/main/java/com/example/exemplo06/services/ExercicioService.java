package com.example.exemplo06.services;

import org.springframework.stereotype.Service;

@Service
public class ExercicioService {
    public String recomendaFilme(String ambientacao, String genero) {
        if (ambientacao.equals("scifi") && genero.equals("comedia"))
            return "homens de preto";
        if (ambientacao.equals("scifi") && genero.equals("drama"))
            return "Arivval";
        if (ambientacao.equals("medieval") && genero.equals("comedia"))
            return "sherek";
        if (ambientacao.equals("medieval") && genero.equals("drama"))
            return "BBB";
        else
            return "nenhum filme";

    }
}

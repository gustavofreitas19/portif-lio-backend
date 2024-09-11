package com.example.exemplo06.controllers;

import com.example.exemplo06.services.ExercicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio")
public class ExercicioController {
    @Autowired
    private ExercicioService exercicioService;

    public String recomendaFilme(@RequestParam String genero, @RequestParam String ambientacao){
        return exercicioService.recomendaFilme(ambientacao,genero);
    }
}

package com.example.exemplo06.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class FipeController {
    RestClient cliente = RestClient.create("URL");

    public String valor(){
        return cliente

    }

}

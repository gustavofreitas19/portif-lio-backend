package com.example.exemplo06.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class OlaController {
    @GetMapping("/olaMundo")
    public String olamundo(){
        return "salve gurizada";
    }
}

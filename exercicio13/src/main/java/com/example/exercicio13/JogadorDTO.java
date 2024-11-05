package com.example.exercicio13;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class JogadorDTO {
    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "O apelido é obrigatório")
    private String apelido;
}
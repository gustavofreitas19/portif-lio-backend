package com.example.exercicio08;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FipeResponse {
    @JsonProperty("Valor")
    private String valor;

    // Outros campos da resposta JSON podem ser adicionados aqui

    public String getValor() {
        return valor;
    }
}

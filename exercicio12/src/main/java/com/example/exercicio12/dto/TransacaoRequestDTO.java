package com.example.exercicio12.dto;

public record TransacaoRequestDTO(String origem, String destino, double valor) {
    public TransacaoRequestDTO {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor da transação deve ser maior que zero.");
        }
    }
}

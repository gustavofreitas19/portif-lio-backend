package com.example.exercicio12.dto;

public record TransacaoResponseDTO(ContaDTO origem, ContaDTO destino, double valor) {
}

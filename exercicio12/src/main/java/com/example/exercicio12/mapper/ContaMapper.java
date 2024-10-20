package com.example.exercicio12.mapper;

import com.example.exercicio12.dto.ContaDTO;
import com.example.exercicio12.model.Conta;

public class ContaMapper {
    public static ContaDTO toDTO(Conta conta) {
        return new ContaDTO(conta.getCodigo(), conta.getCliente());
    }
}

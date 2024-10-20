package com.example.exercicio12.Service;

import com.example.exercicio12.model.Conta;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransacoesService {
    private final List<Conta> contas;

    public TransacoesService() {
        this.contas = new ArrayList<>();
        contas.add(new Conta("500-1", "Fulano"));
        contas.add(new Conta("320-2", "Ciclano"));
    }

    public Conta findContaByCodigo(String codigo) {
        return contas.stream()
                .filter(conta -> conta.getCodigo().equals(codigo))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Conta não encontrada: " + codigo));
    }
}

package com.example.exercicio12.controller;

import com.example.exercicio12.Service.TransacoesService;
import com.example.exercicio12.dto.TransacaoRequestDTO;
import com.example.exercicio12.dto.TransacaoResponseDTO;
import com.example.exercicio12.mapper.ContaMapper;
import com.example.exercicio12.model.Conta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    private final TransacoesService transacoesService;

    @Autowired
    public TransacaoController(TransacoesService transacoesService) {
        this.transacoesService = transacoesService;
    }

    @PostMapping
    public ResponseEntity<TransacaoResponseDTO> gerarTransacao(@RequestBody TransacaoRequestDTO request) {
        Conta origem = transacoesService.findContaByCodigo(request.origem()); // Correção aqui
        Conta destino = transacoesService.findContaByCodigo(request.destino()); // Correção aqui

        // Aqui você pode implementar a lógica de transação, como debitar e creditar valores

        TransacaoResponseDTO response = new TransacaoResponseDTO(
                ContaMapper.toDTO(origem),
                ContaMapper.toDTO(destino),
                request.valor() // Correção aqui
        );

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

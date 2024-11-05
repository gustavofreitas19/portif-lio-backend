package com.example.exercicio13;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorRepository jogadorRepository;

    @Autowired
    private JogadorMapper jogadorMapper;

    // POST /jogadores
    @PostMapping
    public ResponseEntity<JogadorDTO> criarJogador(@Valid @RequestBody JogadorDTO jogadorDTO) {
        Jogador jogador = jogadorMapper.toEntity(jogadorDTO);
        jogadorRepository.save(jogador);
        return ResponseEntity.ok(jogadorMapper.toDTO(jogador));
    }

    // GET /jogadores
    @GetMapping
    public List<JogadorDTO> listarJogadores() {
        return jogadorRepository.findAll()
                .stream()
                .map(jogadorMapper::toDTO)
                .collect(Collectors.toList());
    }
}

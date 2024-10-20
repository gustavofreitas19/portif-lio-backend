package com.example.exercicio12.controller;

import com.example.exercicio12.Service.TransacoesService;
import com.example.exercicio12.dto.TransacaoRequestDTO;
import com.example.exercicio12.model.Conta;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class TransacaoControllerTest {
    @Mock
    private TransacoesService transacoesService;

    @InjectMocks
    private TransacaoController transacaoController;

    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(transacaoController).build();
    }

    @Test
    public void testGerarTransacao() throws Exception {
        // Mockando as respostas do serviço
        Conta origem = new Conta("500-1", "Fulano");
        Conta destino = new Conta("320-2", "Ciclano");

        // Define o comportamento do serviço
        when(transacoesService.findContaByCodigo("500-1")).thenReturn(origem);
        when(transacoesService.findContaByCodigo("320-2")).thenReturn(destino);

        // Cria o JSON da requisição
        String jsonRequest = new ObjectMapper().writeValueAsString(
                new TransacaoRequestDTO("500-1", "320-2", 100)
        );

        // Realiza a requisição e valida a resposta
        ResultActions resultActions = mockMvc.perform(post("/transacoes")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonRequest));

        // Verifica se a resposta está OK e se os dados retornados estão corretos
        resultActions.andExpect(status().isOk())
                .andExpect(jsonPath("$.origem.codigo").value("500-1"))
                .andExpect(jsonPath("$.origem.cliente").value("Fulano"))
                .andExpect(jsonPath("$.destino.codigo").value("320-2"))
                .andExpect(jsonPath("$.destino.cliente").value("Ciclano"))
                .andExpect(jsonPath("$.valor").value(100));
    }
}

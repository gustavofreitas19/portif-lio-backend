package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    public ArrayList<Filme> filmesDisponiveis = new ArrayList<>();
    public List<Ingresso> ingressosVendidos;

    public Cinema() {
        filmesDisponiveis = new ArrayList<>();
        ingressosVendidos = new ArrayList<>();

        // Adicionando filmes disponíveis
        filmesDisponiveis.add(new Filme("O Poderoso Chefão", 15.0, 18));
        filmesDisponiveis.add(new Filme("O Senhor dos Anéis: A Sociedade do Anel", 20.0, 12));
        filmesDisponiveis.add(new Filme("Pulp Fiction", 12.0, 18));
        filmesDisponiveis.add(new Filme("A Origem", 18.0, 13));
        filmesDisponiveis.add(new Filme("Parasita", 16.0, 16));
    }

    public List<Filme> getFilmesDisponiveis() {
        return filmesDisponiveis;
    }
    public List<Ingresso> getIngressosVendidos() {
        return ingressosVendidos;
    }
    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }
    public void adicionarIngresso(Ingresso ingresso) {
        ingressosVendidos.add(ingresso);
    }
}

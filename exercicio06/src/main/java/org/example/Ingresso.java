package org.example;

public class Ingresso {
    public String cliente;
    private String filme;
    private String assento;

    // Construtor da classe Ingresso
    public Ingresso(String cliente, String filme, String assento) {
        this.cliente = cliente;
        this.filme = String.valueOf(filme);
        this.assento = assento;
    }

    // Getters e setters para os atributos
    public String getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = String.valueOf(cliente);
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = String.valueOf(filme);
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }
}

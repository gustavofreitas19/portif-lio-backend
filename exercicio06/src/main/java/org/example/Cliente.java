package org.example;

public class Cliente {
    public String nome;
    public int idade;

    // Construtor vazio
    public Cliente() {
    }

    // Construtor com parâmetros
    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método toString para exibir os atributos do objeto
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}


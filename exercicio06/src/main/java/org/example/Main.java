package org.example;

import java.util.Scanner;

public class Main {
    private static Object ArrayList;

    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        // Adicione os filmes disponíveis
        cinema.filmesDisponiveis.add(new Filme("O Poderoso Chefão", 15.0, 18));
        cinema.filmesDisponiveis.add(new Filme("O Senhor dos Anéis: A Sociedade do Anel", 20.0, 12));
        cinema.filmesDisponiveis.add(new Filme("Pulp Fiction", 12.0, 18));
        cinema.filmesDisponiveis.add(new Filme("A Origem", 18.0, 13));
        cinema.filmesDisponiveis.add(new Filme("Parasita", 16.0, 16));

        Scanner scanner = new Scanner(System.in);

        // Peça ao usuário para inserir os dados do ingresso
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o nome do filme:");
        String nomeFilme = scanner.nextLine();

        System.out.println("Digite o assento desejado (de A1 a F5):");
        String assento = scanner.nextLine();


    }
}

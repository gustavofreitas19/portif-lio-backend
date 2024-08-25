package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("qual ambientacao você prefere?");
        System.out.println("1 sci-fi");
        System.out.println("2 medieval");
        Integer opcaoAmbientacao = leitor.nextInt();

        System.out.println("qual genero voce prefere?");
        System.out.println("1 comedia");
        System.out.println("2 drama");
        Integer opcaoGenero = leitor.nextInt();


        if(opcaoAmbientacao == 1 && opcaoGenero == 1) System.out.println("te indico o filme O mundo depois de nós");
        if(opcaoAmbientacao == 1 && opcaoGenero == 2) System.out.println("te indico o filme Bad Boys");
        if(opcaoAmbientacao == 2 && opcaoGenero == 1) System.out.println("te indico o filme Interestelar");
        if(opcaoAmbientacao == 2 && opcaoGenero == 2) System.out.println("te indico o filme lucy");

    }
}

package org.example;

import java.util.ArrayList;
import java.util.List;

public class portoPequeno {
    static class BasePorto {
        String nome;
        List<Barco> barcosAtracados;

        public BasePorto(String nome) {
            this.nome = nome;
            this.barcosAtracados = new ArrayList<>();
        }

        public void atracarBarco(Barco barco) {
            barcosAtracados.add(barco);
        }

        public void desatracarBarco(Barco barco) {
            barcosAtracados.remove(barco);
        }
    }

    static class PortoPequeno extends BasePorto {
        public PortoPequeno(String nome) {
            super(nome);
        }
        public void atracarBarco(Barco barco) {
            if (barco.tamanho <= 10) {
                super.atracarBarco(barco);
                System.out.println("Barco " + barco.nome + " atracado no porto pequeno!");
            } else {
                System.out.println("Barco " + barco.nome + " muito grande para este porto.");
            }
        }
    }
}

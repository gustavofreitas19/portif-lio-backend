package org.example;

import java.util.ArrayList;
import java.util.List;

public class portoGrande {
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

    static class PortoGrande extends BasePorto {
        public PortoGrande(String nome) {
            super(nome);
        }
        public void atracarBarco(Barco barco) {
            if (barco.tamanho >= 10) {
                super.atracarBarco(barco);
                System.out.println("Barco " + barco.nome + " atracado no porto grande!");
            } else {
                System.out.println("Barco " + barco.nome + " muito pequeno para este porto.");
            }
        }
    }
}

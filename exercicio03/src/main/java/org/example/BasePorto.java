package org.example;

import java.util.ArrayList;
import java.util.List;

public class BasePorto {
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

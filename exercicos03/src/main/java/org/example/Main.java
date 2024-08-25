package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Barco> barcos = new ArrayList<>();
        barcos.add(new Barco("Barco 1", 2));
        barcos.add(new Barco("Barco 2", 5));
        barcos.add(new Barco("Barco 3", 7));
        barcos.add(new Barco("Barco 4", 12));
        barcos.add(new Barco("Barco 5", 20));


        portoPequeno.PortoPequeno portoPequeno = new portoPequeno.PortoPequeno("Porto Pequeno");
        portoGrande.PortoGrande portoGrande = new portoGrande.PortoGrande("Porto Grande");


        for (Barco barco : barcos) {
            portoPequeno.atracarBarco(barco);
            if (!portoPequeno.barcosAtracados.contains(barco)) {
                portoGrande.atracarBarco(barco);
            }
        }
    }
}


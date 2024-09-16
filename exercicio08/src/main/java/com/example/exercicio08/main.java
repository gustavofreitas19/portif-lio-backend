package com.example.exercicio08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class main {
	public static void main(String[] args) {
		meuControlador controlador = new meuControlador();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a marca do veículo:");
		String marca = scanner.nextLine();

		System.out.println("Informe o modelo do veículo:");
		String modelo = scanner.nextLine();

		System.out.println("Informe o ano do veículo:");
		String ano = scanner.nextLine();

		String valorFipe = controlador.consultarFipe(marca, modelo, ano);
		System.out.println("Valor da tabela FIPE: " + valorFipe);

		scanner.close();
	}

}

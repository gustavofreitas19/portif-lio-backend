package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //string[] elementos ={"agua","fogo","ar","terra"};
        while(true){
            String[] Elemenetos = new String[4];

            Elemenetos[0] ="agua";
            Elemenetos[1] ="fogo";
            Elemenetos[2] ="ar";
            Elemenetos[3] ="terra";


           Scanner leitor = new Scanner (System.in);

           System.out.println("digite o primeiro nome");
            String primeiroNome =leitor.nextLine();

            System.out.println("digite o segundo nome");
            String segundoNome =leitor.nextLine();

            Random generateNum = new Random();
            Integer num=generateNum.nextInt(10,100);
            Integer ele = generateNum.nextInt(10,100);

            System.out.println(primeiroNome + " " + segundoNome + " " + num );

            if (primeiroNome == "") return;;
         }
    }
}
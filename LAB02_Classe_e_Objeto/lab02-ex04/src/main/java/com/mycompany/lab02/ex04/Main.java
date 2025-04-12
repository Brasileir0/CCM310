package com.mycompany.lab02.ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double notas;
        Scanner teclado = new Scanner(System.in);
        int cont = 0;
        double soma = 0;
        
        for (int i = 0; i < 80; i++) {
            notas = teclado.nextDouble();
            if (notas >= 6) {
                cont++;
            }
            soma += notas;
        }
        
        System.out.println("A quantidade de alunos aprovados foi de: " + cont);
        System.out.println("A média das notas foi de: %.2f" + soma/80);
    }
}

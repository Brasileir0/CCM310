package com.mycompany.lab02.ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o valor de n: ");
        int n = teclado.nextInt();
        double soma = 0;
        
        for (double i = 1; i <= n; i++) {
            soma += 1.0/i;
        }
        
        System.out.println("O valor final da soma é de: " + soma);
    }
}

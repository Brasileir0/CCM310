package com.mycompany.lab02.ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int idade = 0;
        double sum_idade = 0;
        double cont = 0;
        int contm = 0;
        int contf = 0;
        int sum_salario = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        while(true) {
            System.out.println("Informe seu sexo(M/F): ");
            char sexo = teclado.next().charAt(0);
            System.out.println("Informe sua idade");
            idade = teclado.nextInt();
            if (idade < 0) {
                break;
            }
            sum_idade += idade;
            System.out.println("Informe seu salário: ");
            double salario = teclado.nextDouble();
            
            if (sexo == 'M') {
                contm++;
                sum_salario += salario;
            } else {
                if (sexo == 'F' && salario < 600) {
                    contf++;
                }
            }
            
            cont++;
        }
        double media_idade = sum_idade/cont;
        float media_salario = sum_salario/contm;
        
        System.out.println("A média de idade do grupo foi de: " + media_idade);
        System.out.printf("A média de salário entre homens é de: %.2f \n", media_salario);
        System.out.println("A quantidade de mulheres com salário abaixo de 600 foi de: " + contf);
        
    }
}

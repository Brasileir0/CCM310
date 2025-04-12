package com.mycompany.lab07.ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author unifvnobre
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        while(true){
                System.out.println("Digite um número: ");
            int num1 = in.nextInt();

            System.out.println("Digite outro número:");
            int num2 = in.nextInt();

            try {
                int resposta = num1/num2;
                System.out.println("Resposta = " + resposta);
                break;
            } catch(ArithmeticException e) {
                System.out.println("Erro = " + e.getMessage());
                System.out.println("Digite um número diferente de 0");
            } catch(InputMismatchException e) {
                System.out.println("Erro = " + e.getMessage());
                System.out.println("Digite apenas números");
            } finally {
                System.out.println("Fui executado '-'");
            }
        }
        
        
        
        
        
    }
}

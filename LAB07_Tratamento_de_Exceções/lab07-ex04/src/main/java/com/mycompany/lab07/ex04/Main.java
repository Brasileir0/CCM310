package com.mycompany.lab07.ex04;

/**
 *
 * @author unifvnobre
 */
public class Main {
    public static void Xtest(int test) {
        if (test == 1) {
            throw new IntException("Erro!");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Start\n");
        try {
            System.out.println("Inside block try");
            Xtest(0);
            Xtest(1);
            Xtest(2);
        } catch(RuntimeException e) {
            System.out.println("Caught an exception = " + e.getMessage());
        }
        
        System.out.println("Código continua");
        System.out.println("END");
    
    }
}

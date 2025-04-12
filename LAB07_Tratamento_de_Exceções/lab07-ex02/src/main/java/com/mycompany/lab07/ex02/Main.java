package com.mycompany.lab07.ex02;

/**
 *
 * @author unifvnobre
 */
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa01 = null;
        
        try {
            System.out.println(pessoa01.toString());
        } catch(NullPointerException e) {
            System.out.println("Erro = " + e);
            
        }
        
    
    }
}

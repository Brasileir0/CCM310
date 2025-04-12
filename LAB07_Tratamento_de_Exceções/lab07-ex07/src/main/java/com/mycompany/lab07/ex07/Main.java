package com.mycompany.lab07.ex07;

import java.util.Scanner;

/**
 *
 * @author unifvnobre
 */
public class Main {
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userL, senhaL;
        
        Login l = new Login("Vinicius", "123");
        
        System.out.println("Insira o usuário: ");
        userL = in.next();
        
        System.out.println("Insira a senha: ");
        senhaL = in.next();
        
        try {
            System.out.println(l.logar(userL, senhaL));
        } catch (LoginException e) {
            System.out.println("Erro = " + e.getMessage());
        }
        
    }
}

package com.mycompany.lab04.ex05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author unifvnobre
 */
public class TestePeca {
    public static void main(String[] args){
        ArrayList<Peca> pecas = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        //PEÇAS BRANCAS
        pecas.add(new Peca("Peão  ", "  Branca ", "a2"));
        pecas.add(new Peca("Peão  ", "  Branca ", "b2"));
        pecas.add(new Peca("Peão  ", "  Branca ", "c2"));
        pecas.add(new Peca("Peão  ", "  Branca ", "d2"));
        pecas.add(new Peca("Peão  ", "  Branca ", "e2"));
        pecas.add(new Peca("Peão  ", "  Branca ", "f2"));
        pecas.add(new Peca("Peão  ", "  Branca ", "g2"));
        pecas.add(new Peca("Peão  ", "  Branca ", "h2"));
        pecas.add(new Peca("Torre  ", " Branca ", "a1"));
        pecas.add(new Peca("Torre  ", " Branca ", "h1"));
        pecas.add(new Peca("Cavalo  ", "Branca ", "b1"));
        pecas.add(new Peca("Cavalo  ", "Branca ", "g1"));
        pecas.add(new Peca("Bispo  ", " Branca ", "c1"));
        pecas.add(new Peca("Bispo  ", " Branca ", "f1"));
        pecas.add(new Peca("Rainha  ", "Branca ", "d1"));
        pecas.add(new Peca("Rei  ", "   Branca ", "e1"));

        //PEÇAS PRETAS
        pecas.add(new Peca("Peão  ", "  Preta  ", "a7"));
        pecas.add(new Peca("Peão  ", "  Preta  ", "b7"));
        pecas.add(new Peca("Peão  ", "  Preta  ", "c7"));
        pecas.add(new Peca("Peão  ", "  Preta  ", "d7"));
        pecas.add(new Peca("Peão  ", "  Preta  ", "e7"));
        pecas.add(new Peca("Peão  ", "  Preta  ", "f7"));
        pecas.add(new Peca("Peão  ", "  Preta  ", "g7"));
        pecas.add(new Peca("Peão  ", "  Preta  ", "h7"));
        pecas.add(new Peca("Torre  ", " Preta  ", "a8"));
        pecas.add(new Peca("Torre  ", " Preta  ", "h8"));
        pecas.add(new Peca("Cavalo  ", "Preta  ", "b8"));
        pecas.add(new Peca("Cavalo  ", "Preta  ", "g8"));
        pecas.add(new Peca("Bispo  ", " Preta  ", "c8"));
        pecas.add(new Peca("Bispo  ", " Preta  ", "f8"));
        pecas.add(new Peca("Rainha  ", "Preta  ", "d8"));
        pecas.add(new Peca("Rei  ", "   Preta  ", "e8"));
        
        for(Peca i : pecas) {
            System.out.println(i.getTipo() +  " " + i.getCor() + " " + 
                    i.getPosicao() + " ");
        }
        System.out.println("");
        System.out.println("Informe a posição da peça que deseja retirar: ");
        String posi = input.nextLine();
        System.out.println("");
        
        //System.out.println(pecas.size());
        for(int i = 0; i < pecas.size(); i++) {
            if (posi.equalsIgnoreCase(pecas.get(i).getPosicao())) {
                System.out.println("Peça removida: " + pecas.get(i).getTipo() + 
                        pecas.get(i).getCor());
                pecas.remove(i);
            }
        }
            
        for(Peca i : pecas) {
            System.out.println(i.getTipo() +  " " + i.getCor() + " " + 
                    i.getPosicao() + " ");
        }
    }
}

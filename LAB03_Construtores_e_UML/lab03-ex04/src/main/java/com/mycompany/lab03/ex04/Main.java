package com.mycompany.lab03.ex04;

import java.util.Scanner;

public class Main {
    
    
    public static void main(String[] args) {
        Televisao tv1 = new Televisao();
        Televisao tv2 = new Televisao();
        Scanner input = new Scanner(System.in);
        String modeloLocal;
        float precoLocal, tamanhoLocal;
        int volumeLocal, canalLocal;
        boolean ligadaLocal;
        
        System.out.println("'---- TELEVISÃO 1 ----'");
        //MODELO
        System.out.println("Qual o modelo da televisão?");
        modeloLocal = input.nextLine();
        tv1.setModelo(modeloLocal);
        //PRECO
        System.out.println("Qual o preço da televisão? (>0)");
        precoLocal = input.nextFloat();
        tv1.setPreco(precoLocal);
        //TAMANHO
        System.out.println("Qual o tamanho da televisão? (>23)");
        tamanhoLocal = input.nextFloat();
        tv1.setTamanho(tamanhoLocal);
        //VOLUME
        System.out.println("Qual o volume que a televisão está? (100>=volume>=0)");
        volumeLocal = input.nextInt();
        tv1.setVolume(volumeLocal);
        //CANAL
        System.out.println("Qual o canal que a televisão está? (0 - 155)");
        canalLocal = input.nextInt();
        tv1.setCanal(canalLocal);
        //LIGAR?
        System.out.println("Deseja ligar a televisão?\n1 - Sim\nOutro valor - Não");
        int escolha = input.nextInt();
        tv1.ligarTv(escolha);
        //ALTERAR VOLUME
        System.out.println("Insira o novo volume: ");
        volumeLocal = input.nextInt();
        tv1.alteraVolume(volumeLocal);
        //ALTERAR CANAL
        System.out.println("Aumentar ou diminuir o valor do canal?\n1 - Aumentar\n2 - Diminuir");
        escolha = input.nextInt();
        tv1.alteraCanal(escolha);
        
        input.nextLine();
        System.out.println("'---- TELEVISÃO 2 ----'");
        //MODELO
        System.out.println("Qual o modelo da televisão?");
        modeloLocal = input.nextLine();
        tv2.setModelo(modeloLocal);
        //PRECO
        System.out.println("Qual o preço da televisão? (>0)");
        precoLocal = input.nextFloat();
        tv2.setPreco(precoLocal);
        //TAMANHO
        System.out.println("Qual o tamanho da televisão? (>23)");
        tamanhoLocal = input.nextFloat();
        tv2.setTamanho(tamanhoLocal);
        //VOLUME
        System.out.println("Qual o volume que a televisão está? (100>=volume>=0)");
        volumeLocal = input.nextInt();
        tv2.setVolume(volumeLocal);
        //CANAL
        System.out.println("Qual o canal que a televisão está? (0 - 155)");
        canalLocal = input.nextInt();
        tv2.setCanal(canalLocal);
        //LIGAR?
        System.out.println("Deseja ligar a televisão?\n1 - Sim\nOutro valor - Não");
        escolha = input.nextInt();
        tv2.ligarTv(escolha);
        //ALTERAR VOLUME
        System.out.println("Insira o novo volume: ");
        volumeLocal = input.nextInt();
        tv2.alteraVolume(volumeLocal);
        //ALTERAR CANAL
        System.out.println("Aumentar ou diminuir o valor do canal?\n1 - Aumentar\n2 - Diminuir");
        escolha = input.nextInt();
        tv2.alteraCanal(escolha);
       
    }
    
}

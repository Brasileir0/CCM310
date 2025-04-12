package com.mycompany.lab03.ex04;

import java.util.Scanner;

public class Televisao {
    private String modelo;
    private float preco;
    private float tamanho;
    private int volume;
    private int canal;
    private boolean ligada;
    
    Scanner input = new Scanner(System.in);
    
    //SET
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setPreco(float preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido!");
        }  
    }
    
    public void setTamanho(float tamanho) {
        if (tamanho >= 24) {
            this.tamanho = tamanho;
        } else {
            System.out.println("Tamanho não permitido!");
        }  
    }
    
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("Não é possível adicionar um volume menor que 0 ou maior que 100");
        }
    }
    
    public void setCanal(int canal) {
        if (canal <= 155 && canal >= 0) {
            this.canal = canal;
        } else {
            System.out.println("Canal não encontrado!");
        }  
    }
    
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
   
    //FUNÇÕES
    public void ligarTv(int escolha) {
        if (escolha == 1) {
            ligada = true;
        } else {   
            ligada = false;   
        }
    }
    
    public void alteraVolume(int novo_volume) {
        if (ligada == true) {
            if (novo_volume >= 0 && novo_volume <= 100) {
                this.volume = novo_volume;
            } 
        } else {
             System.out.println("Não é possível alterar o volume pois a Televisão está desligada!");
         }
    }
    
    public void alteraCanal(int escolha) {
         if (ligada == true) {
      
            if (escolha == 1) {
                this.canal++;
            } else {
                if(escolha == 2) {
                    this.canal--;
                } else {
                    System.out.println("Escolha não encontrada, tente novamente.");
                }
            }
        } else {
             System.out.println("Não é possível alterar o canal pois a Televisão está desligada!");
         }
    }
    
    //GET
    public String getModelo() {
        return modelo;
    }
    
    public float getPreco() {
        return preco;
    }
    
    public float getTamanho() {
        return tamanho;
    }
    
    public int getVolume() {
        return volume;
    }
    
    public int getCanal() {
        return canal;
    }
    
    public boolean getLigada() {
        return ligada;
    }
}

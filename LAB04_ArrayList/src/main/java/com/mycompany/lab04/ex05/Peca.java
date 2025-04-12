package com.mycompany.lab04.ex05;

/**
 *
 * @author unifvnobre
 */
public class Peca {
    private String tipo, cor, posicao;

    public Peca(String tipo, String cor, String posicao) {
        this.tipo = tipo;
        this.cor = cor;
        this.posicao = posicao;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    
    
    
}

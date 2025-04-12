package com.mycompany.lab06.teste;

/**
 *
 * @author unifvnobre
 */
public abstract class Agente {
    private String nome, profissao;
    private boolean modo_agente;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public boolean isModo_agente() {
        return modo_agente;
    }
    
    public void setModo_agente(boolean modo_agente) {
        this.modo_agente = modo_agente;
    }
   
    abstract void apresentacao();
    
    public void modo_agente_on() {
        modo_agente = true;
    }
}

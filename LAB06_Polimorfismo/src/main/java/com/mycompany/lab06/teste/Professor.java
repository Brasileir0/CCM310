package com.mycompany.lab06.teste;

/**
 *
 * @author unifvnobre
 */
public class Professor extends Agente {
    private String nome, profissao, escola;

    public Professor(String nome, String profissao, String escola, boolean modo_agente) {
        this.nome = nome;
        this.profissao = profissao;
        this.escola = escola;
        super.setModo_agente(modo_agente);
    }
    
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

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    @Override
    public void apresentacao() {
        if (super.isModo_agente() == true){
            System.out.println("AGENTE " + nome + "(" + profissao + ")");
        } else {
            System.out.println(nome + "(" + profissao + ")");
        }
    }
}

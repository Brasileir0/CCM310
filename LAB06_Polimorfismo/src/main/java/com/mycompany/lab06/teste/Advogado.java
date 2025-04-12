package com.mycompany.lab06.teste;

/**
 *
 * @author unifvnobre
 */
public class Advogado extends Agente{
    private String nome, profissao, OAB;

    public Advogado(String nome, String profissao, String OAB, boolean modo_agente) {
        this.nome = nome;
        this.profissao = profissao;
        this.OAB = OAB;
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

    public String getOAB() {
        return OAB;
    }

    public void setOAB(String OAB) {
        this.OAB = OAB;
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

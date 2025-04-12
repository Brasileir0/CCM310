package com.mycompany.lab06.teste;

/**
 *
 * @author unifvnobre
 */
public class Empresario extends Agente {
    private String nome, profissao, empresa;

    public Empresario(String nome, String profissao, String empresa, boolean modo_agente) {
        this.nome = nome;
        this.profissao = profissao;
        this.empresa = empresa;
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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
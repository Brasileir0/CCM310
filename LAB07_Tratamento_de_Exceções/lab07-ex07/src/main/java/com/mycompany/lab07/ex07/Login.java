package com.mycompany.lab07.ex07;

/**
 *
 * @author unifvnobre
 */
public class Login {
    private String user, senha;

    public Login(String user, String senha) {
        this.user = user;
        this.senha = senha;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String logar(String userL, String senhaL) {
        if (this.user.equals(userL) && this.senha.equals(senhaL)) {
           return "Logado com sucesso!"; 
        } else {
            throw new LoginException("Usuário ou senha incorreto!");
        }
    }
}

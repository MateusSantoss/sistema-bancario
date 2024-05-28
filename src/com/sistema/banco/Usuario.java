package com.sistema.banco;
public class Usuario {
    public String nome;
    private ContaBanco conta;
    

    public Usuario (String usuario, ContaBanco conta) {
        this.nome = usuario;
        this.conta = conta;
    }

    public ContaBanco getContaBanco () {
       return this.conta;
    }

    


    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", conta=" + conta + "]";
    }

    
}

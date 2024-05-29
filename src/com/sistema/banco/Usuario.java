package com.sistema.banco;

/**
 * @author Mateus santos
 * @version 1.0
 * @since 29/05/2024
 * Classe de modelo de usuario usuário
 */
public class Usuario {
    public String nome;
    private ContaBanco contaCorrente;
    private ContaBanco contaPoupanca;
    
    /**
     * 
     * @param usuario
     * @param contaCorrente
     */
    public Usuario (String usuario, ContaBanco contaCorrente) {
        this.nome = usuario;
        this.contaCorrente = contaCorrente;
        this.contaPoupanca = contaPoupanca;
    }
    
    
    public ContaBanco getContaCorrente () {
       return this.contaCorrente;
    }
    
    public void setContaPoupanca (Usuario usuario, double valor) {
        this.contaPoupanca = new ContaPoupanca(usuario, valor);
    }

    
    public ContaBanco getContaPoupanca () {
        return this.contaPoupanca;
    }

    public String getNome () {
        return this.nome;
    } 

    


    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", contaCorrente=" + contaCorrente + ", contaPoupanca=" + contaPoupanca + "]";
    }

    
}

package com.sistema.banco;

import java.util.ArrayList;
import java.util.List;


public class Banco {
    public String nome;


    List<Usuario> usuarios;

    public Banco () {
        usuarios = new ArrayList<>();
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void criarContaCorrente (Usuario usuario) {
         
         usuarios.add(usuario);


    }

    public void criarContaPoupancao () {
        
    }

    public void exibirContasCadastradas () {
         for (Usuario usuario : usuarios) {
            System.out.println("Conta: " + usuario);
            
         }
    }

   
  

    public static void main (String [] args) {
       Banco novBanco = new Banco();
        
       
       Usuario joao = new Usuario("joão" , new ContaCorrente());
       Usuario maria = new Usuario("maria" ,new ContaCorrente());
       
       novBanco.criarContaCorrente(joao);
       novBanco.criarContaCorrente(maria);
       

       joao.getContaBanco().depositar(22.2);
       

       novBanco.exibirContasCadastradas();

       
    }

    @Override
    public String toString() {
        return "Banco [nome=" + nome + ", usuarios=" + usuarios + "]";
    }
    
}

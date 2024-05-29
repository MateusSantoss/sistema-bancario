package com.sistema.banco;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mateus santos
 * @since 29/05/2024
 * @version 1.0
 */
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

    /**
     * 
     * @param usuario 
     * O metodo adiciona os usuarios a lista de usuarios do banco
     */
    public void adicionarUsusario (Usuario usuario) {
         
         usuarios.add(usuario);

    }

    
    /** */
    public void exibirContasCadastradas () {
         for (Usuario usuario : usuarios) {
            System.out.println("Conta: " + usuario);
            
         }
    }

   
  

    public static void main (String [] args) {
       Banco novBanco = new Banco();
       novBanco.setNome("NovBanco");
    
       Usuario joao = new Usuario("joão" , new ContaCorrente());
       Usuario maria = new Usuario("maria" ,new ContaCorrente());
       
       novBanco.adicionarUsusario(joao);
       novBanco.adicionarUsusario(maria);
       

       joao.getContaCorrente().depositar(1200);
       joao.getContaCorrente().transferir(150, joao, maria);
       maria.setContaPoupanca(maria, 100);
      // joao.getContaCorrente().transferir(200, joao, maria);
       joao.setContaPoupanca(joao, 200);
       System.out.println(joao.getContaPoupanca());

       

       novBanco.exibirContasCadastradas();

       
    }

    @Override
    public String toString() {
        return "Banco [nome=" + nome + ", usuarios=" + usuarios + "]";
    }
    
}

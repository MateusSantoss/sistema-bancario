package com.sistema.banco;
public class ContaPoupanca extends ContaBanco {
   private double valorPoupanca = 0;

   public ContaPoupanca (Usuario usuario, double valorPoupanca) {
      usuario.getContaCorrente().sacar(valorPoupanca);
      this.valorPoupanca = valorPoupanca;
   }


   public void sacar (double valor) {
     this.valorPoupanca -= valor;
   }

   public void depositar (double valor) {
     this.valorPoupanca += valor;
   }


   public void transferirParaContaCorrente (Usuario usuarioContaPoupanca, Usuario usuarioContaCorrente, double valor) {
     usuarioContaPoupanca.getContaCorrente().sacar(valor);
     usuarioContaCorrente.getContaPoupanca().depositar(valor);
   }


@Override
public String toString() {
    return "ContaPoupanca [valorPoupanca=" + valorPoupanca + "]";
}



    
}

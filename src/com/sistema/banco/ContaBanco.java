package com.sistema.banco;

public class ContaBanco {
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo = 0;
  
    public ContaBanco () {
        this.agencia = AGENCIA_PADRAO++;
        this.numero = SEQUENCIAL++;
    }



    public int getAgencia () {
        return this.agencia;
    }

    public int getNumero () {
        return this.numero;
    }


    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo () {
         return this.saldo;
    }



    public void depositar (double valor) {
        this.saldo += valor;
        

    }

    public void sacar (double valor) {
        this.saldo -= valor;

    }

    public void transferir (double valor, ContaBanco conta) {
        conta.depositar(valor);
    }



    @Override
    public String toString() {
        return "ContaBanco [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
    }

 
    
}

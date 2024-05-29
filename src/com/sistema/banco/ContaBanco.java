package com.sistema.banco;

/**@author Mateus santos
 * @version 1.0
 * @since 29/05/2024
 * 
 * Essa é uma classe modelo de ContaBanco, o atributo AGENCIA_PADRAO e SEQUENCIAL são auto-incrementados
 * por sua vez os atributos agencia e numero recebem esses valores auto-incrementados de forma dinâmica.
 */
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
    
    /**
     * 
     * @param valor
     * @param usuarioTransferidor
     * @param usuarioRecebedor
     */
    public void transferir (double valor, Usuario usuarioTransferidor, Usuario usuarioRecebedor) {
        usuarioTransferidor.getContaCorrente().sacar(valor);
        usuarioRecebedor.getContaCorrente().depositar(valor);
        System.out.println(usuarioTransferidor.getNome() + " fez um transferência para a conta bancária de " + usuarioRecebedor.getNome() + " no valor de: " + valor);
         
    }

   


    @Override
    public String toString() {
        return "ContaBanco [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
    }

 
    
}

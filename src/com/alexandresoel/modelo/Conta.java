package com.alexandresoel.modelo;

public abstract class Conta implements Operacoes {

    private static final int AGENCIA_PADRAO = 1;
    private static  int SEQUENCIAL = 1;

    protected int numero;
    protected int agencia;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor) {
        if(this.saldo < valor){
            throw new RuntimeException("Saldo indisponível");
        } else {
            this.saldo -= valor;

        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    @Override
    public void conferirExtrato() {
        System.out.println("Valor Disponível: R$" + this.getSaldo());
    }
}

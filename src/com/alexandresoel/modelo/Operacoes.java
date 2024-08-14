package com.alexandresoel.modelo;

public interface Operacoes {
    public void sacar(double valor);
    public void depositar(double valor);
    public void transferir(double valor, Conta destino);
    public void conferirExtrato();

}

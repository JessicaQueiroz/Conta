package com.company;

public class Conta {
    protected int numeroConta;
    //double saldo = 100;
    private double saldo = 100;

    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
    }

    public void sacar(double valorSaque){
        this.saldo -= valorSaque;
    }

    public double recuperaSaldo(){
        return this.saldo;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjexemploclasseabstrata01_2026.models;

/**
 *
 * @author Iftm
 */
public abstract class Conta {
    protected String agencia;
    protected String numero;
    protected double saldo;
    
    public Conta (String agencia, String numero){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo = 0.0;
    }
    
    public void depositar(double valor){
        if(valor>0){
            this.saldo +=valor;
            System.out.println(String.format("Deposito de R$ %.2f realizado com sucesso",valor));
        } else{
            System.out.println("O valor do deposito deve ser positivo, burro.");
        }
    }
    
    public void saque(double valor){
        if(valor>0 && valor<saldo){
            this.saldo -=valor;
            System.out.println(String.format("Saque de R$ %.2f realizado com sucesso",valor));
        } else{
            System.out.println("O valor do saque e superior ao valor do saldo.");
        }
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}

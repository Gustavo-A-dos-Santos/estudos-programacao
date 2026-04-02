/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjexemploclasseabstrata01_2026.models;

/**
 *
 * @author Iftm
 */
public class ContaCorrente extends Conta{
    
    private static final double TAXA = 0.50;
    
    public ContaCorrente(String agencia, String numero){
        super(agencia, numero);
    }
    
    @Override
    public void sacar(double valor){
        double valorTotalSaque = valor + TAXA;
        
        if(valor<=0){
            System.out.println("O valor do saque deve sr positivo");
            return;
        }
        
        if(this.saldo>=valorTotalSaque){
            this.saldo-=valorTotalSaque;
            System.out.println(String.format("Saque de R$ %.2f realizado. (Taxa de R$ %.2f aplicada)", valor, TAXA));
        } else {
            System.out.println("Saldo insuficiente para realizar o saque e cobrir a taxa de serviço.");
        }
    }
    
}

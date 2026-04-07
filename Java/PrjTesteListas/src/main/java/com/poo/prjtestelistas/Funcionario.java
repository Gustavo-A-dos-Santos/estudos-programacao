/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prjtestelistas;

/**
 *
 * @author julig
 */
public class Funcionario {
    
    
    private String nome;
    private double salario;
    
    
    
    public Funcionario(String nome, double salario){
        
        this.nome = nome;
        this.salario = salario;
        
        
    }
     public String toString(){
         
         
         return "Funcionario{nome = '"  + nome + ", Salario= " + salario ;
                 
     }
     
     
    
    
    
}

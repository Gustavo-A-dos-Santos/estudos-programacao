/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prjeqseggrau_poo1;

/**
 *
 * @author GHOST
 */
public class CalcularSimples {
    DadosSaida ds = new DadosSaida();
    
    public DadosSaida Soma(DadosEntrada de){
        ds.setSoma(de.getA()+de.getB());
        return ds;
    }
    public DadosSaida Subtracao(DadosEntrada de){
        ds.setSubtracao(de.getA()-de.getB());
        return ds;
    }
    public DadosSaida Mult(DadosEntrada de){
        ds.setMult(de.getA()*de.getB());
        return ds;
    }
    public DadosSaida Div(DadosEntrada de){
        ds.setDiv(de.getA()/de.getB());
        return ds;
    }

}

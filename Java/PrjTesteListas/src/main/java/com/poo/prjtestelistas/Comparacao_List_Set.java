package com.poo.prjtestelistas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Comparacao_List_Set{
    
    public void funcionamentoList(){
        
        List<String> listaDeCompras = new ArrayList<>();
        
        listaDeCompras.add("Maca");
        listaDeCompras.add("Leite");
        listaDeCompras.add("Pao");
        listaDeCompras.add("Leite");
        System.out.println(" Lista de Compras" + listaDeCompras);
        System.out.println("Item na segunda posicao (indice 1) :" + listaDeCompras.get(1));
        
        listaDeCompras.remove("Pao");
        
        System.out.println("Lista de Compras apos remover 'Pao :" + listaDeCompras);
        System.out.println("Tamanho da lista " + listaDeCompras.size());
    }
    
     public void funcionamentoSet(){
         Set<String> participantes = new HashSet<>();
         participantes.add("Maria");
         participantes.add("Joao");
         participantes.add("Ana");
         participantes.add("Joao");
         System.out.println("Lista de participantes :"+ participantes);
        boolean foiAdicionado = participantes.add("Maria");
        System.out.println("A duplicata 'Maria'  foi adicionada? " + foiAdicionado);
        
        System.out.println("Tamanho do conjunto " + participantes.size());
    }
    
    
        
    }
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prjtestelistas;

import java.util.HashMap;
import java.util.Map;

public class ExemploMaps {
    
    public void exHashMapSimples(){
        Map<String,Integer> idades = new HashMap<>();
        idades.put("Joao", 30);
        idades.put("Maria", 25);
        idades.put("Jose", 35);
        idades.put("Carlos", 40);
     System.out.println("Mapa de idades: " + idades);
     
     int idadePessoal = idades.get("Joao");
     System.out.println("A idade de Joao e : "+ idadePessoal);
     Integer idadePessoal2 = idades.get("Pedro");
     System.out.println("A idade de Pedro e : "+ idadePessoal2);
     
      boolean contemKey = idades.containsKey("Maria");  
         System.out.println("O mapa contem a chave Maria '?' : "+ contemKey);
        boolean contemIdade = idades.containsValue(40);   
        System.out.println("O mapa contem a idade 40 '?' : "+ contemIdade);
        idades.remove("Jose");
        System.out.println("O mapa apos remover Jose "+ idades);
          System.out.println("\n Interando sobre as chaves e valores :") ;

        for (Map.Entry<String,Integer> entry : idades.entrySet()){
          System.out.println("Chaves : "+ entry.getKey() + "Valor" + entry.getValue());

        }
        
    }  
    
    
    public void exHashMapComObjetos(){
            
            Map<String,Funcionario> funcionarios = new HashMap<>();
            
            funcionarios.put ("Fun001",new Funcionario("Joao",5000.00));
            funcionarios.put ("Fun002",new Funcionario("Jose",6500.00));
            funcionarios.put ("Fun003",new Funcionario("Maria",4800.00));
            
            System.out.println("Mapa de Funcionarios : "+ funcionarios);
            String idParaBuscar ="Fun002";
            Funcionario funcionarioEncontrado = funcionarios.get(idParaBuscar);
            
            if(funcionarioEncontrado != null){
                
                System.out.println("\n Funcionario Encontrado como ID " + idParaBuscar + ": "); 
                System.out.println(funcionarioEncontrado);
                
                
            } else {
               System.out.println("\n  Nenhum Funcionario encontrado  com o ID  " + idParaBuscar);
            }
        }
    
   
        
    }
    


package com.poo.prjexemploheranca_030926.relatorio;

import com.poo.prjexemploheranca_030926.modelos.Pessoa;
import com.poo.prjexemploheranca_030926.modelos.Carro;
import com.poo.prjexemploheranca_030926.modelos.PessoaJuritica;
import com.poo.prjexemploheranca_030926.modelos.PessoaFisica;
import java.util.List;

public class MostrarDados {
    
    public void mostrarPessoa(Pessoa p)
    {
        System.out.println("Nome: "+p.getNome());
        if(p instanceof PessoaFisica pf)
        {
             
            System.out.println("CPF: "+pf.getCpf());
            System.out.println("RG: "+pf.getRg());
            
        }
        else
        {
            PessoaJuritica pj = (PessoaJuritica)p;
            System.out.println("CNPJ: "+pj.getCnpj());
            System.out.println("Insc, Est.: "+pj.getInscricaoEstadual());
        }
        mostrarCarro(p.getLstCarro());
    }
    
    
    public void mostrarCarro(List<Carro> carros)
    {   
        
        if (carros != null) 
        {
            System.out.println("**********************************");
            for(Carro carro : carros)
            {
                ;
                System.out.println("Nome: "+carro.getNome());
                System.out.println("Marca: "+carro.getMarca());
                System.out.println("Modelo: "+carro.getModelo());
                System.out.println("PLaca: "+carro.getPlaca());
                System.out.println("Ano: "+carro.getAno());
                System.out.println("**********************************");
            }
        }    
    }
    
    public void mostrarCarro(Carro c)
    {
        System.out.println("Nome: "+c.getNome());
        System.out.println("Marca: "+c.getMarca());
        System.out.println("Modelo: "+c.getModelo());
        System.out.println("PLaca: "+c.getPlaca());
        System.out.println("Ano: "+c.getAno());
        System.out.println("***********PROPRIETARIO***********");
        System.out.println("Nome: "+c.getPessoa().getNome());
    }

    public void mostrarCarro2(Carro c){
        if (c.getNome() != null) {
        System.out.println("Nome: "+c.getNome());
    }
        System.out.println("Marca: "+c.getMarca());
        System.out.println("Modelo: "+c.getModelo());
        System.out.println("Placa: "+c.getPlaca());
        System.out.println("Ano: "+c.getAno());
        
        System.out.println("***********PROPRIETARIO***********");
        
        Pessoa p = c.getPessoa();
        if (p != null) {
            if (p.getNome() != null) {
                System.out.println("CPF: "+ p.getNome());
            }
        }
        
        if (p instanceof PessoaFisica pf) {
            System.out.println("CPF:"+pf.getCpf());
        } else if (p instanceof PessoaJuritica pj){
            System.out.println("CNPJ: "+pj.getCnpj());
        }
    }
}
package com.poo.prjexemploheranca_030926.gerenciar_dados;

import com.poo.prjexemploheranca_030926.modelos.PessoaFisica;
import com.poo.prjexemploheranca_030926.modelos.PessoaJuritica;
import com.poo.prjexemploheranca_030926.modelos.Pessoa;
import com.poo.prjexemploheranca_030926.modelos.Carro;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;

public class ManterArquivoCarro {
    
    private final String NOME_ARQUIVO = "C:\\Users\\GHOST\\teste_carros.txt";
    
    public void escreverArquivo(Carro c)
    {
        String texto = Obj2Str(c);
        File f = new File(NOME_ARQUIVO);
        try
        {
            FileWriter fw = new FileWriter(f, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(texto);
            fw.close();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
    
    public List<Carro> lerArquivo()
    {
        List<Carro> carros = new ArrayList();
        try
        {
            File f = new File(NOME_ARQUIVO);
            if (!f.exists()) return carros;
         
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
  
            
            while(br.ready())
            {
                carros.add(Str2Obj(br.readLine())); 
            }
            fr.close();
         }
        catch(IOException ex){
            ex.printStackTrace();
        }
        return carros;
    }
    
    public  List<Carro> buscarCarrosPorPessoa(String documento)
    {
        List<Carro> todosCarros = lerArquivo();
        List<Carro> carrosDaPessoa = new ArrayList<>();
        
        for (Carro c : todosCarros) {
            Pessoa p = c.getPessoa();
            if (p instanceof PessoaFisica pf && pf.getCpf().equals(documento)) {
            carrosDaPessoa.add(c);
            } else if (p instanceof PessoaJuritica pj && pj.getCnpj().equals(documento)){
            carrosDaPessoa.add(c);
            }
        }
        return carrosDaPessoa;
    }
    
    public Pessoa buscarPessoaPorCarro(String placa)
    {
        List<Carro> todosCarros = lerArquivo();
        
        for (Carro c : todosCarros) {
            if (c.getPlaca().equalsIgnoreCase(placa)) {
                return c.getPessoa();
            }
        }
        return null;
    }
    
    private String Obj2Str(Carro c)
    {
        String docProprientario = "";
        
        if(c.getPessoa() != null)
        {
            if (c.getPessoa() instanceof PessoaFisica pf) {
                docProprientario = pf.getCpf();
            } else if (c.getPessoa() instanceof PessoaJuritica pj) {
                docProprientario = pj.getCnpj();
            }
        } 
        
        return "Placa: "+c.getPlaca()+"; Mome: "+c.getNome()+"; Marca: "+c.getMarca()+
                "; Modelo:"+c.getModelo()+"; Ano: "+c.getAno()+"; DocProprietario: "+docProprientario;
    }
    
    private Carro Str2Obj(String texto) {       
        Carro c = new Carro();
        List<String> atributos = extraiAtributos(texto);
            
        c.setPlaca(atributos.get(0));
        c.setNome(atributos.get(1));
        c.setMarca(atributos.get(2));
        c.setModelo(atributos.get(3));
        c.setAno(Integer.parseInt(atributos.get(4)));
        
        String documento = atributos.get(5);
        if (documento.length() > 14) {
            PessoaJuritica pj = new PessoaJuritica();
            pj.setCnpj(documento);
            c.setPessoa(pj);
        } else 
        {
            PessoaFisica pf = new PessoaFisica();
            pf.setCpf(documento);
            c.setPessoa(pf);
        }
        return c;
    }
    
    private List<String> extraiAtributos(String texto){
        String partes[] = texto.split(";"); 
        List<String> atributos = new ArrayList<>();
        
        for (String parte : partes) {
            String valor = parte.split(":")[1].trim();
            atributos.add(valor);
        }
        return atributos;
    }
}

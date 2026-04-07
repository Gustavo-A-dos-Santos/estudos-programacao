package com.poo.prjexemploheranca_030926.menus;

import com.poo.prjexemploheranca_030926.gerenciar_dados.ManterArquivoPessoa;
import com.poo.prjexemploheranca_030926.gerenciar_dados.ManterArquivoCarro;
import com.poo.prjexemploheranca_030926.modelos.PessoaFisica;
import com.poo.prjexemploheranca_030926.modelos.PessoaJuritica;
import com.poo.prjexemploheranca_030926.modelos.Pessoa;
import com.poo.prjexemploheranca_030926.modelos.Carro;
import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {

private ManterArquivoPessoa manterArquivoPessoa = new ManterArquivoPessoa();
private ManterArquivoCarro manterArquivoCarro = new ManterArquivoCarro();
private Scanner scanner = new Scanner(System.in);

    public void exiberMenu(){
        int opcao = 0;

        do {
            System.out.println("\n====== SISTEMA DE GESTAO DE VEICULOS ======");
            System.out.println("1. Cadastrar Pessoa Fisiaca (PF)");
            System.out.println("2. Cadastrar Pessoa Juridica (PJ)");
            System.out.println("3. Adicionar novo carro a uma Pessoa existente");
            System.out.println("4. Consultar");
            System.out.println("5. Sair");
            System.out.println("Escolhe uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um numero valido.");
                continue;
                }
                switch (opcao) {

                    case 1:
                        cadastrarPF();
                        break;
                    case 2:
                        cadastrarPJ();
                        break;
                    case 3:
                        adicionarCarroPessoaExistente();
                        break;
                    case 4:
                        consultarCarros();
                        break;
                    case 5:
                        System.out.println("Bye Bye o sistema, falesceu... Sera que eu volto?");
                        break;
                    default:
                        System.out.println("Opção invalida!");
                        }
        } while (opcao != 5);
        scanner.close();
    }

    private void cadastrarPF(){
        System.out.println("\n--- Cadastro de Pessoa Fisica ---");
        PessoaFisica pf = new PessoaFisica();

        System.out.println("Nome: ");
        pf.setNome(scanner.nextLine());
        System.out.println("CPF: ");
        pf.setCpf(scanner.nextLine());
        System.out.println("RG: ");
        pf.setRg(scanner.nextLine());

        manterArquivoPessoa.escreverArquivo(pf);
        System.out.println("Pessoa Fisica cadastrada com sucesso, ou sera que nao!");

        cadastrarCarro(pf);
    }

    private void cadastrarPJ(){
        System.out.println("\n--- Cadastro de Pessoa Juridica'\'Empresario ---");
        PessoaJuritica pj = new PessoaJuritica();

        System.out.println("Nome da Empresa: ");
        pj.setNome(scanner.nextLine());
        System.out.println("CNPJ: ");
        pj.setCnpj(scanner.nextLine());
        System.out.println("Inscrição Estadual: ");
        pj.setInscricaoEstadual(scanner.nextLine());

        manterArquivoPessoa.escreverArquivo(pj);
        System.out.println("Pessoa Juridica cadastrada com sucesso!");

        cadastrarCarro(pj);
    }

    private void cadastrarCarro(Pessoa proprientario){
        String resposta;
        do {            
            System.out.println("\nDeseja adicionar um carro para este proprietario? (S/N):");
            resposta = scanner.nextLine().toUpperCase();

            if (resposta.equals("S")) {
                Carro carro = new Carro();

                System.out.println("Nome do Carro: ");
                carro.setNome(scanner.nextLine());
                System.out.println("Marca: ");
                carro.setMarca(scanner.nextLine());
                System.out.println("Modelo: ");
                carro.setModelo(scanner.nextLine());
                System.out.println("Placa: ");
                carro.setPlaca(scanner.nextLine());

                System.out.println("Ano: ");
                try {
                    carro.setAno(Integer.parseInt(scanner.nextLine()));
                } catch (NumberFormatException e) {
                    System.out.println("Ano Invalido. Salvo como 0");
                    carro.setAno(0);
                }

                carro.setPessoa(proprientario);
                manterArquivoCarro.escreverArquivo(carro);
                System.out.println("Carro salvo com sucesso");
            }
        } while (resposta.equals("S"));
    }

    private void adicionarCarroPessoaExistente(){
        System.out.println("\n--- Adicionar Carro a Proprietario Existemte ");
        System.out.print("Digite o CPF ou CNPJ do proprietario: ");
        String documento = scanner.nextLine();

        List<Pessoa> todasPessoas = manterArquivoPessoa.lerArquivo();
        Pessoa pessoaEncontrada = null;

            for (Pessoa p : todasPessoas) {
                if (p instanceof  PessoaFisica pf && pf.getCpf().equals(documento)) {
                    pessoaEncontrada = pf;
                    break;
                } else if (p instanceof PessoaJuritica pj && pj.getCnpj().equals(documento)) {
                    pessoaEncontrada = pj;
                    break;
                }
            }
            if (pessoaEncontrada != null) {
                 System.err.println("Proprietario localizado: "+ pessoaEncontrada.getNome());
                 cadastrarCarro(pessoaEncontrada);
            } else {
                 System.out.println("Erro: Nenhuma proprientario encontrado com este documento, digitou errado :(?.");
            }
    }

    private void consultarCarros(){
        System.out.println("\n--- Consultar Carros ---");
        System.out.print("Digite o CPF ou CNPJ para buscar os veiculos: ");
        String documento = scanner.nextLine();

        List<Carro> carros = manterArquivoCarro.buscarCarrosPorPessoa(documento);

        if (carros.isEmpty()) {
            System.out.println("Nenhum veiculo encontrado para este documento.");
        } else{
            System.out.println("\n--- Veiculos Encontrados ("+carros.size()+") ---");
            for (Carro c : carros) {
                System.out.println("Placa: "+c.getPlaca()+" | Carro: "+c.getNome()+" | Marca: "+
                        c.getMarca()+" | An: "+c.getAno());
            }
            System.out.println("-------------------------------------");
        }
    } 
}


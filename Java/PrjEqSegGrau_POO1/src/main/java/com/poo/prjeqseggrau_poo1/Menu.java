/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prjeqseggrau_poo1;

import java.util.Scanner;

/**
 *
 * @author GHOST
 */
public class Menu {

    Scanner teclado = new Scanner(System.in);
    DadosSaida ds = new DadosSaida();
    DadosEntrada de = new DadosEntrada();
    CalcularSimples cs = new CalcularSimples();
    CalcularEqSegGrau esg = new CalcularEqSegGrau();

    public void interfa() {
        int opcaoMenu;
        char continuar;

        do {
            System.out.print("Escolha uma Calculadora:\n1-Calculadora Simples\n2-Calculadora Segundo Grau\nEscolha: ");
            opcaoMenu = teclado.nextInt();

            switch (opcaoMenu) {
                case 1:
                    System.out.print("Escolha uma Operacao:\n1-Soma\n2-Subtracao\n3-Multiplicacao\n4-Divisao\nEscolha: ");
                    int op1 = teclado.nextInt();

                    System.out.print("Digite A: ");
                    de.setA(teclado.nextDouble());
                    System.out.print("Digite B: ");
                    de.setB(teclado.nextDouble());

                    switch (op1) {
                        case 1:
                            ds = cs.Soma(de);
                            System.out.println("Soma: " + ds.getSoma());
                            break;
                        case 2:
                            ds = cs.Subtracao(de);
                            System.out.println("Subtracao: " + ds.getSubtracao());
                            break;
                        case 3:
                            ds = cs.Mult(de);
                            System.out.println("Multiplicacao: " + ds.getMult());
                            break;
                        case 4:
                            ds = cs.Div(de);
                            System.out.println("Divisao: " + ds.getDiv());
                            break;
                    }
                    break;

                case 2:
                    System.out.print("Digite A: ");
                    de.setA(teclado.nextDouble());
                    System.out.print("Digite B: ");
                    de.setB(teclado.nextDouble());
                    System.out.print("Digite C: ");
                    de.setC(teclado.nextDouble());
                    ds = esg.delta(de);
                    System.out.println("Delta: " + ds.getDelta());
                    ds = esg.x1l(de);
                    System.out.println("x1: " + ds.getX1l());
                    ds = esg.x12(de);
                    System.out.println("x2: " + ds.getX2l());
                    ds = esg.xV(de);
                    System.out.println("xV: " + ds.getxV());
                    ds = esg.yV(de);
                    System.out.println("yV: " + ds.getyV());
            }

            System.out.print("\nDeseja continuar? (s/n): ");
            continuar = teclado.next().toLowerCase().charAt(0);

        } while (continuar == 's');

        System.out.println("Programa encerrado.");
    }

}

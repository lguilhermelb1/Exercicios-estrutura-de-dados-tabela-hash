/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos2;

import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class Main {

    //Menu da tabela
    public static char menu() {
        String msg;
        System.out.println("\n1 para inserir produto");
        System.out.println("2 para consultar produtos de um tipo");
        System.out.println("3 para contar quantos produtos estão cadastrados em cada tipo");
        System.out.println("4 para fechar o menu");
        msg = new Scanner(System.in).next();
        return msg.charAt(0);
    }

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Lista tabela = new Lista();
        Hash hash = new Hash();
        Produto p;
        String tipo;
        int qtdA = 0;
        int qtdH = 0;
        int qtdL = 0;
        int qtdV = 0;
        char opcao;
        do {
            opcao = menu();
            switch (opcao) {
                case '1':
                    System.out.println("\nDescrição do produto");
                    p = new Produto();
                    p.setDesc(l.next());
                    System.out.println("\nTipo do produto");
                    p.setTipo(l.next());
                    if (p.getTipo().equals("A")) {
                        qtdA++;
                    } else if (p.getTipo().equals("H")) {
                        qtdH++;
                    } else if (p.getTipo().equals("L")) {
                        qtdL++;
                    } else if (p.getTipo().equals("V")) {
                        qtdV++;
                    }
                    tabela.inserir(p);
                    hash.inserir(p);
                    break;
                case '2':
                    if (tabela.vazia()) {
                        System.out.println("\nA tabela está vazia");
                    } else {
                        System.out.println("\nDigite o tipo que deseja visualizar os produtos");
                        tipo = l.next();
                        if (tipo.equals("A")) {
                            System.out.println(hash.Produtos[0].imprimirTipo(tipo));
                        } else if (tipo.equals("H")) {
                            System.out.println(hash.Produtos[1].imprimirTipo(tipo));
                        } else if (tipo.equals("L")) {
                            System.out.println(hash.Produtos[2].imprimirTipo(tipo));
                        } else if (tipo.equals("V")) {
                            System.out.println(hash.Produtos[3].imprimirTipo(tipo));
                        } else {
                            System.out.println("\nTipo inexistente");
                        }
                    }
                    break;
                case '3':
                    System.out.println("\nAlimentação - " + qtdA);
                    System.out.println("\nHigiene - " + qtdH);
                    System.out.println("\nLimpeza - " + qtdL);
                    System.out.println("\nVestuário - " + qtdV);
                    break;
                case '4':
                    System.out.println("\nDesligando programa");
                    break;
                default:
                    System.out.println("\nOpção inexistente, tente novamente");
            }
        } while (opcao != '4');
        System.exit(0);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoas;

import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class Main {

    //Menu da tabela
    public static char menu() {
        String msg;
        System.out.println("\n1 para cadastrar pessoa");
        System.out.println("2 para consultar todas as pessoas");
        System.out.println("3 para consultar uma pessoa");
        System.out.println("4 para consultar pessoas com a inicial desejada");
        System.out.println("5 para excluir uma pessoa");
        System.out.println("6 para fechar o menu");
        msg = new Scanner(System.in).next();
        return msg.charAt(0);
    }

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Hash hash = new Hash();
        Pessoa p;
    
        String n;
        String inicial;
        
        char opcao;
        do {
            opcao = menu();
            switch (opcao) {
                case '1':
                    System.out.println("\nInserindo pessoa");
                    p = new Pessoa();
                    System.out.println("\nDigite o nome da pessoa");
                    n = l.next();
                    p.setNome(n);
                    hash.inserir(p);
                    break;
                case '2':
                    System.out.println("\nTodas as pessoas:");
                    for(int i = 0; i < hash.qtd; i++){
                    System.out.println(hash.Pessoas[i].imprimir());
                    }
                    break;
                case '3':
                    System.out.println("\nDigite o nome que deseja encontrar");
                    n = l.next();
                    for(int i = 0; i < hash.qtd; i++){
                    System.out.println(hash.Pessoas[i].encontrar(n, i));
                    }
                    break;
                case '4':
                    System.out.println("\nDigite a inicial que deseja");
                    inicial = l.next();
                    for(int i = 0; i < hash.qtd; i++){
                    System.out.println(hash.Pessoas[i].imprimirInicial(inicial));
                    }
                    break;
                case '5':
                    System.out.println("\nDigite o nome que deseja excluir");
                    n = l.next();
                    for(int i = 0; i < hash.qtd; i++){
                    hash.Pessoas[i].remover(n);
                    }
                    System.out.println("Excluído");
                    break;
                case '6':
                    System.out.println("\nDesligando programa");
                    break;
                default:
                    System.out.println("\nOpção inexistente, tente novamente");
            }
        } while (opcao != '6');
        System.exit(0);
    }

}

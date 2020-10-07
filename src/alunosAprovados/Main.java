/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alunosAprovados;

import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class Main {

    //Menu da tabela
    public static char menu() {
        String msg;
        System.out.println("\n1 para cadastrar aluno");
        System.out.println("2 para consultar aprovados");
        System.out.println("3 para consultar todos os alunos");
        System.out.println("4 para fechar o menu");
        msg = new Scanner(System.in).next();
        return msg.charAt(0);
    }

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Hash hash = new Hash();
        Aluno a;

        int c;
        String n;
        float nf;

        char opcao;
        do {
            opcao = menu();
            switch (opcao) {
                case '1':
                    System.out.println("\nInserindo Aluno");
                    a = new Aluno();
                    System.out.println("\nDigite o código do Aluno");
                    c = l.nextInt();
                    a.setCodigo(c);
                    System.out.println("\nDigite o nome do Aluno");
                    n = l.next();
                    a.setNome(n);
                    System.out.println("\nDigite a nota final do Aluno");
                    nf = l.nextFloat();
                    if (nf < 0 || nf > 10) {
                        System.out.println("\nNota inapropriada");
                    } else {
                        a.setNota(nf);
                        hash.inserir(a);
                    }
                    
                    break;
                case '2':
                    System.out.println("\nAlunos aprovados:");
                    for (int i = 0; i < hash.qtd; i++) {
                        System.out.println(hash.Alunos[i].imprimirMaior());
                    }
                    break;
                case '3':
                    System.out.println("\nTodos os alunos:");
                    for (int i = 0; i < hash.qtd; i++) {
                        System.out.println(hash.Alunos[i].imprimir());
                    }
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
